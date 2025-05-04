package com.example.retrox1

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.ai.client.generativeai.type.content

@Composable
fun UserComposeView() {

    val userviewmodel : UserViewModel = viewModel()
    val userlist = userviewmodel.getUsers()
    LazyColumn {
        items(userlist){ user ->
            UserView(user)
        }
    }
}

@Composable
fun UserView(user : User){
    Text(text= user.name)
}