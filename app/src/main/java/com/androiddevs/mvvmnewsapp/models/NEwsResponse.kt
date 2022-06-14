package com.androiddevs.mvvmnewsapp.models

data class NEwsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)