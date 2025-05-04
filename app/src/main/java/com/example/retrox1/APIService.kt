package com.example.retrox1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class APIService {

    private val retrofit = Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val userServices = retrofit.create(ApiServices::class.java)

    interface ApiServices {
        @GET("/users")
        suspend fun getUsers(): List<User>
        @GET("/posts")
        suspend fun getCompanyName() : List<Companydetails>
    }
}