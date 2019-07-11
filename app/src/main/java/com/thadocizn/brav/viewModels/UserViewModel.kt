package com.thadocizn.brav.viewModels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.thadocizn.brav.model.User
import com.thadocizn.brav.repositories.UserRepository

/**
 * Created by charles on 11,July,2019
 */

class UserViewModel(user: User, application: Application) : AndroidViewModel(application) {

    private val repository: UserRepository = UserRepository(user,application)

    val allUsers: LiveData<List<User>>
        get() = repository.userList

}
