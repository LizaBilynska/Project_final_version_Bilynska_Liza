package com.example.bilynska_liza_final_version_project.UI.fragments.WSNlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bilynska_liza_final_version_project.UI.models.WSN_Categories
import com.example.bilynska_liza_final_version_project.data.models.WSN
import com.example.bilynska_liza_final_version_project.domain.WSNUseCase
import kotlinx.coroutines.launch

class WSN_ViewModel: ViewModel() {

    private val _WSNLiveData= MutableLiveData<List<WSN>>()
    val WSNLiveData: LiveData<List<WSN>> = _WSNLiveData
    // использование под вопросом
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _categoryLiveDate = MutableLiveData<List<String>>()
    val categoryLiveData: LiveData<List<String>> = _categoryLiveDate

    init {
        getNewsData("world")
        _categoryLiveDate.postValue(WSN_Categories.getCategories())
    }

    fun getNewsData (category: String) {
        viewModelScope.launch {
            _isLoading.postValue(true)
            val news = WSNUseCase.News_to_get(category)
            _WSNLiveData.postValue(news.data)
            _isLoading.postValue(false)
        }
    }
}