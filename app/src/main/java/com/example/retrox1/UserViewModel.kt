package com.example.retrox1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class UserViewModel : ViewModel(){

    val userRepository = Userrepository()

    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users: StateFlow<List<User>> = _users.asStateFlow()

    private val _companyname = MutableStateFlow<List<Post>>(emptyList())
    val companyname : StateFlow<List<Post>> = _companyname.asStateFlow()

    init {
        getUsers()
        getCompanyName()
    }

    fun getUsers(){
        viewModelScope.launch {
            _users.value = userRepository.getUsers()
        }
    }

    fun getCompanyName(){
        viewModelScope.launch {
            _companyname.value = userRepository.getCompanyName()
        }
    }
}