package com.example.newsapp.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.newsapp.models.Article

@Composable
fun FullViewUi(modifier: Modifier = Modifier, article: Article?, navController: NavHostController) {

    AsyncImage(article?.urlToImage, contentDescription = null)

}