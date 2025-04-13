package com.example.newsapp.myviewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.models.Article
import com.example.newsapp.models.NewsModels
import com.example.newsapp.repo.Repo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyViewmodel : ViewModel() {

    val response = mutableStateOf<NewsModels?>(null)
    val article = mutableStateOf<Article?>(null)

    val repo = Repo()

    init {
        fetchNews()
    }

    fun fetchNews() {
        viewModelScope.launch(Dispatchers.IO) {
            response.value = repo.newsProvider("us", "business").body()
        }
    }
}