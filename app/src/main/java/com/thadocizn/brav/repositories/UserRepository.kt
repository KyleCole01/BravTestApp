package com.thadocizn.brav.repositories

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import com.thadocizn.brav.model.User

/**
 * Created by charles on 10,July,2019
 */
class UserRepository(private val user: User, val application: Application) {

    lateinit var users: MutableList<User>
    private val mutableLiveData = MutableLiveData<List<User>>()

    val userList: MutableLiveData<List<User>>
        get() {
            users.add(user)
            mutableLiveData.postValue(users)
            return mutableLiveData
        }
}