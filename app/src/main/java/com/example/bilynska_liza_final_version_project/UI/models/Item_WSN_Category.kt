package com.example.bilynska_liza_final_version_project.UI.models

import android.view.View
import com.example.bilynska_liza_final_version_project.R
import com.example.bilynska_liza_final_version_project.databinding.WsnItemCategoryBinding
import com.xwray.groupie.viewbinding.BindableItem

class Item_WSN_Category( val category: String): BindableItem<WsnItemCategoryBinding>() {

    override fun bind(viewBinding: WsnItemCategoryBinding, position: Int) {
        viewBinding.categoryText.text = category
    }

    override fun getLayout(): Int {
        return R.layout.wsn_item_category
    }

    override fun initializeViewBinding(view: View): WsnItemCategoryBinding {
        return WsnItemCategoryBinding.bind(view)
    }
}
