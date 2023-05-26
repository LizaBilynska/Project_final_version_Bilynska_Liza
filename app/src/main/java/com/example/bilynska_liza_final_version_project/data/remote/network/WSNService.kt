package com.example.bilynska_liza_final_version_project.data.remote.network

import com.example.bilynska_liza_final_version_project.data.models.WSN_Category
import retrofit2.http.GET
import retrofit2.http.Query

interface WSNService {
    @GET("news")
    suspend fun News_to_get(@Query("category") category: String): WSN_Category
}