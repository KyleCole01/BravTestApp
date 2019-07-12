package com.thadocizn.brav.views

import android.app.Dialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.auth0.android.Auth0
import com.auth0.android.authentication.AuthenticationException
import com.auth0.android.provider.AuthCallback
import com.auth0.android.provider.WebAuthProvider
import com.thadocizn.brav.R
import kotlinx.android.synthetic.main.activity_main.*
import com.auth0.android.result.Credentials
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    val clientId = getString(R.string.com_auth0_client_id)
    val domain = getString(R.string.com_auth0_domain)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnEnter.setOnClickListener{

            startActivity<UserRegister>()

            val account = Auth0(clientId,domain)
            account.isOIDCConformant = true

            WebAuthProvider.login(account)
                .withAudience("https://$domain/userinfo")
                .start(this,object: AuthCallback {
                    override fun onFailure(dialog: Dialog){
                        //show error dialog
                    }
                    override fun onFailure(exception: AuthenticationException){
                        //show error to user
                    }
                    override fun onSuccess(credentials: Credentials){
                        //store credentials
                        //Navigate to main activity (logged in)
                    }
                })



        }


    }
}
