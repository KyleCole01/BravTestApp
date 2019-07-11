package com.thadocizn.brav.model

/**
 * Created by charles on 10,July,2019
 */
typealias Name = String

typealias Email = String

typealias Phone = String

data class User(
    val name: Name,
    val email: Email,
    val phone: Phone,
    val timZone: String,
    val country: String
)