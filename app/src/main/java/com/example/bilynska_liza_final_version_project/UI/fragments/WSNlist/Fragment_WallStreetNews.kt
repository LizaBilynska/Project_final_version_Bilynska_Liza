package com.example.bilynska_liza_final_version_project.UI.fragments.WSNlist

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bilynska_liza_final_version_project.R
import com.example.bilynska_liza_final_version_project.UI.models.Item_WSN
import com.example.bilynska_liza_final_version_project.UI.models.Item_WSN_Category
import com.example.bilynska_liza_final_version_project.databinding.FragmentWsnBinding
import com.xwray.groupie.GroupieAdapter

class Fragment_WallStreetNews : Fragment(R.layout.fragment_wsn) {
    private lateinit var binding: FragmentWsnBinding
    private lateinit var WSNViewModel: WSN_ViewModel

    private var WSN_list_adapter = GroupieAdapter()
    private var WSN_category_adapter = GroupieAdapter()

    private var currentWSNCategory = "world"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentWsnBinding.bind(view)
        WSNViewModel = ViewModelProvider(this) [WSN_ViewModel::class.java]

        setupNewsRecyclerView()
        setupCategoryRecyclerView()

        binding.swipe.setOnRefreshListener {
            WSN_list_adapter.clear()
            WSNViewModel.getNewsData(currentWSNCategory)
        }
        //        WSNViewModel.isLoading.observe(viewLifecycleOwner) {
//            binding.swipe.isRefreshing = it
//            if (binding.swipe.isRefreshing) {
//                binding.logoIv.visibility = View.VISIBLE
//            }
//            else {
//                binding.logoIv.visibility = View.GONE
//            }
//        }
        WSNViewModel.WSNLiveData.observe(viewLifecycleOwner) { news ->
            news.forEach {
                WSN_list_adapter.add(Item_WSN(it))
            }
            binding.rvCategoryList.isClickable = true
        }
        WSNViewModel.categoryLiveData.observe(viewLifecycleOwner){ list ->
            list.forEach { category ->
                WSN_category_adapter.add(Item_WSN_Category(category))
            }
        }
    }

    private fun setupNewsRecyclerView() {
        binding.newsPageFragment.adapter = WSN_list_adapter
        binding.newsPageFragment.layoutManager = LinearLayoutManager (requireContext())

        WSN_list_adapter.setOnItemClickListener { item, _ ->
            val itemWSN = item as Item_WSN
            val direction = Fragment_WallStreetNewsDirections.actionFragmentWallStreetNewsToNewsPageFragment(itemWSN.WSN)

            findNavController().navigate(direction, navOptions {
                anim {
                    enter = R.anim.from_right
                    popEnter = R.anim.from_left
                    popExit = R.anim.to_right
                    exit = R.anim.to_left


                }
            })
            WSN_list_adapter.clear()
            WSN_category_adapter.clear()

        }

    }

    private fun setupCategoryRecyclerView() {
        binding.rvCategoryList.adapter = WSN_category_adapter
        binding.rvCategoryList.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        WSN_category_adapter.setOnItemClickListener{ item, _ ->
            if(binding.rvCategoryList.isClickable) {
                binding.rvCategoryList.isClickable = false
                WSN_list_adapter.clear()
                val itemWSNCategory = item as Item_WSN_Category
                currentWSNCategory = itemWSNCategory.category
                WSNViewModel.getNewsData(currentWSNCategory)
            }
        }
    }
}