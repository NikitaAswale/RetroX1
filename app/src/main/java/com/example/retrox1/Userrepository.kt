package com.example.retrox1

class Userrepository {

    val apiService = APIService()

    suspend fun getUsers() : List<User> {
       return apiService.userServices.getUsers()
    }

    suspend fun getCompanyName() : List<Post>{
        return apiService.userServices.getCompanyName()
    }
}