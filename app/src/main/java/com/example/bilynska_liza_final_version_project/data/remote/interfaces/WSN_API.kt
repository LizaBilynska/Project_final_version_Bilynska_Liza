package com.example.bilynska_liza_final_version_project.data.remote.interfaces

import com.example.bilynska_liza_final_version_project.data.remote.network.WSNService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WSN_API {
    private const val START_URL = "https://inshorts.deta.dev/"
    val news_Api: WSNService = createRetrofit().create(WSNService::class.java)
    private fun createRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        return Retrofit.Builder()
            .baseUrl(START_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}