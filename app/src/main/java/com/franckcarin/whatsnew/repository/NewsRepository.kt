package com.franckcarin.whatsnew.repository

import com.franckcarin.whatsnew.api.RetrofitInstance
import com.franckcarin.whatsnew.db.ArticleDatabase
import com.franckcarin.whatsnew.models.Article

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getBreakingNews(countyCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countyCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)


    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}