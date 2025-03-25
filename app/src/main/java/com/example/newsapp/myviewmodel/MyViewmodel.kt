package com.example.newsapp.myviewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.models.NewsModels
import com.example.newsapp.repo.Repo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MyViewmodel : ViewModel() {

    val response = mutableStateOf<NewsModels?>(null)

    val repo = Repo()
    init {
        fetchNews()
    }

    fun fetchNews() {
        viewModelScope.launch(Dispatchers.IO) {
            val data = repo.newsProvider("us", "business")
            response.value = data.body()
        }
    }
}