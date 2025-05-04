package com.example.retrox1

class Userrepository {

    val apiService = APIService()

    fun getUsers() : List<User> {
       return apiService.userServices.getUsers()

    }
}