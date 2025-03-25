package com.example.newsapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.newsapp.myviewmodel.MyViewmodel


@Composable
fun HomeUi(viewModel: MyViewmodel) {

    val response = viewModel.response.value?.articles?: emptyList()

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {

            items(response){
                Card(
                    modifier = Modifier.padding(16.dp),
                    colors = CardDefaults.cardColors(Color.Gray)
                ){
                    Text(text = it.title)
                }

            }

        }

    }

}