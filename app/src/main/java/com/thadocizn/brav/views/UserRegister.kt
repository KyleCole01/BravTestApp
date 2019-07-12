package com.thadocizn.brav.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.thadocizn.brav.R
import kotlinx.android.synthetic.main.activity_user_register.*
import org.jetbrains.anko.design.snackbar

class UserRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_register)
        btnGo.setOnClickListener{
            val user = etUserName.text ?: "Welcome Aboard"

            it.snackbar("Hello There, $user")
        }
    }
}
