package com.example.wanderlustguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLoginListener()
        btnRegisterListener()
    }

    private fun startActivity(intent: Intent?, java: Class<LoginActivity>) {
        TODO("Not yet implemented")
    }

    private fun Intent(mainActivity: MainActivity): Intent? {
        TODO("Not yet implemented")
    }

    private fun btnLoginListener(){
        btn_1.setOnClickListener{
            startActivity(Intent(this), LoginActivity::class.java))
        }
    }

    private fun btnRegisterListener(){
        btn_2.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}