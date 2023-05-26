package com.example.bilynska_liza_final_version_project.UI.models

object WSN_Categories {
    private val categories = listOf(
        "technology",
        "world",
        "sports",
        "business",
        "science",
        "politics",)

    fun getCategories(): List<String>{
        return categories
    }
}