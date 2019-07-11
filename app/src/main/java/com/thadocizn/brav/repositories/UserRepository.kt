package com.thadocizn.brav.repositories

import android.arch.lifecycle.MutableLiveData
import com.thadocizn.brav.model.Users

/**
 * Created by charles on 10,July,2019
 */
class UserRepository(private val user: Users) {

    lateinit var userList: MutableList<Users>
    private val mutableLiveData = MutableLiveData<List<Users>>()

    val usersList: MutableLiveData<List<Users>>
        get() {
            userList.add(user)
            mutableLiveData.postValue(userList)
            return mutableLiveData
        }
}