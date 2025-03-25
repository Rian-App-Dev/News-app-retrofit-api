package com.example.newsapp.network

import com.example.newsapp.models.NewsModels
import com.example.newsapp.utills.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=ae61d2a773b548039150520923aa051f
    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsModels>
}