package com.tejas.visuallithuanianapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.tejas.visuallithuanianapp.MainActivity
import com.tejas.visuallithuanianapp.databinding.SplashScreenBinding


class SplashActivity: AppCompatActivity() {

    private lateinit var binding:SplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashScreenBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(binding.root)
        }

        //Use of Executor or Handler is recommended instead of Coroutines as Coroutines have
        // high initialization cost

       Handler(Looper.getMainLooper()).postDelayed({

           startActivity(Intent(this@SplashActivity,MainActivity::class.java))
           finish()
       },3000)
    }
}