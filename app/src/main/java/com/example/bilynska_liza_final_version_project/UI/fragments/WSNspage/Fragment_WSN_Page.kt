package com.example.bilynska_liza_final_version_project.UI.fragments.WSNspage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.bilynska_liza_final_version_project.R
import com.example.bilynska_liza_final_version_project.databinding.FragmentWsnPageBinding

class Fragment_WSN_Page : Fragment(R.layout.fragment_wsn_page) {
    private lateinit var binding: FragmentWsnPageBinding

    private val args: Fragment_WSN_PageArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWsnPageBinding.bind(view)

        val news = args.wsnNews

        Glide.with(binding.root)
            .load(news.imageUrl)
            .into(binding.newsImage)

        binding.newsDate.text = news.date
        binding.newsAuthor.text = news.author_of_the_article

        binding.newsTitle.text = news.title_of_the_article
        binding.newsContent.text = news.content_of_the_article
    }
}