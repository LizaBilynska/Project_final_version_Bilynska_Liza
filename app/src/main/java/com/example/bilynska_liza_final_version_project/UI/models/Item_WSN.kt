package com.example.bilynska_liza_final_version_project.UI.models

import android.view.View
import com.bumptech.glide.Glide
import com.example.bilynska_liza_final_version_project.R
import com.example.bilynska_liza_final_version_project.data.models.WSN
import com.example.bilynska_liza_final_version_project.databinding.ItemNewsBinding
import com.xwray.groupie.viewbinding.BindableItem

class Item_WSN(val WSN: WSN): BindableItem<ItemNewsBinding>() {
    override fun bind(viewBinding: ItemNewsBinding, position: Int) {
        val imageView = viewBinding.articleImg
        Glide.with(imageView.context)
            .load(WSN.imageUrl)
            .into(imageView)
        viewBinding.author.text = WSN.author_of_the_article
        viewBinding.title.text = WSN.title_of_the_article
    }

    override fun getLayout(): Int {
        return R.layout.item_news
    }

    override fun initializeViewBinding(view: View): ItemNewsBinding {

        return ItemNewsBinding.bind(view)
    }
}
