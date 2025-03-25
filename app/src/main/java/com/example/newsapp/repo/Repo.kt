package com.example.newsapp.repo

import com.example.newsapp.models.NewsModels
import com.example.newsapp.network.ApiProvider
import retrofit2.Response

class Repo{
    suspend fun newsProvider(
        country: String,
        category: String
    ) : Response<NewsModels>{
        return ApiProvider.providerApi().getTopHeadlines(
            country = country,
            category = category
        )
    }
}