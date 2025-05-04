package com.example.retrox1

import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel(){

    val userRepository = Userrepository()

    fun getUsers() : List<User>{
        return userRepository.getUsers()
    }
}