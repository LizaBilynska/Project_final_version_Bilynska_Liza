package com.example.bilynska_liza_final_version_project.domain

import com.example.bilynska_liza_final_version_project.data.models.WSN_Category
import com.example.bilynska_liza_final_version_project.data.repo.WSN_Repository

object WSNUseCase {
    suspend fun News_to_get(category: String): WSN_Category {
        return WSN_Repository.News_to_get(category)
    }
}