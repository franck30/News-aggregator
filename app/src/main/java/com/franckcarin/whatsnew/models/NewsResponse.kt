package com.franckcarin.whatsnew.models

import com.franckcarin.whatsnew.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)