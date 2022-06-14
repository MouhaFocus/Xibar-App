package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.database.ArticleDatabase
import com.androiddevs.mvvmnewsapp.models.Article

class NewsRepository (
    val db:ArticleDatabase
        ){

    suspend fun getBreakingNews(countryCode: String, pageNUmber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNUmber)

    suspend fun searchNews(searchQuery: String, pageNUmber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery,pageNUmber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}