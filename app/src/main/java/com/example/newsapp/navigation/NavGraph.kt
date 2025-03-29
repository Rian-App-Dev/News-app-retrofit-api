package com.example.newsapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newsapp.models.Article
import com.example.newsapp.myviewmodel.MyViewmodel
import com.example.newsapp.screens.FullViewUi
import com.example.newsapp.screens.HomeUi


@Composable
fun Nav(modifier: Modifier = Modifier, viewModel: MyViewmodel, article: Article?) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home"){
        composable(route = "home"){
            HomeUi(navController = navController, viewModel = viewModel)
        }
        composable(route = "fullscreen"){
            FullViewUi(navController = navController,article = article)
        }
    }
}