package com.example.bilynska_liza_final_version_project.data.repo

import com.example.bilynska_liza_final_version_project.data.models.WSN_Category
import com.example.bilynska_liza_final_version_project.data.remote.interfaces.WSN_API

object WSN_Repository {
    val API = WSN_API.news_Api
    suspend fun News_to_get(category: String): WSN_Category {
        return API.News_to_get(category)
    }
}