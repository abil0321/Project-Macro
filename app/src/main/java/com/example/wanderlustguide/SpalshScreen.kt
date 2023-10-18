package com.example.wanderlustguide

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val splashTimeOut: Long = 3000 // Durasi splash screen dalam milidetik (3 detik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            // Kode untuk memulai activity utama setelah splash screen
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, splashTimeOut)
    }
}