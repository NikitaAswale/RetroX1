package com.example.retrox1

data class Companydetails(
    val id : Int,
    val name : String,
    val username : String,
    val email : String,
    val address : Address1
)

data class Address1(
    val website : String,
    val company : Company
)

data class Company(
    val name : String
)
