package com.example.listenlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listenlearn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnSignInListenLearn()
    }

    private fun btnSignInListenLearn() {
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}
