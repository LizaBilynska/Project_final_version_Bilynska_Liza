package com.example.bilynska_liza_final_version_project.data.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class WSN(
    val author_of_the_article: String?,
    val content_of_the_article: String?,
    val date: String?,
    val imageUrl: String?,
    val readmore: String?,
    val time: String?,
    val title_of_the_article: String?,
    val url: String?
): Parcelable

