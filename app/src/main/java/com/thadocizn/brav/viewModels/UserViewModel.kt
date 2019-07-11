package com.thadocizn.brav.viewModels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.thadocizn.brav.model.Users
import com.thadocizn.brav.repositories.UserRepository

/**
 * Created by charles on 11,July,2019
 */

class UserViewModel(users: Users, application: Application) : AndroidViewModel(application) {

    private val repository: UserRepository = UserRepository(users)

    val allUsers: LiveData<List<Users>>
        get() = repository.usersList

}
