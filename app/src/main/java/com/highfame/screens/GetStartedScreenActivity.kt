package com.highfame.screens

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.highfame.R
import com.highfame.databinding.ActivityGetStartedScreenBinding

class GetStartedScreenActivity : AppCompatActivity() {
    private lateinit var binding:ActivityGetStartedScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStartedScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetStarted.setOnClickListener {
            val i = Intent(this, LoginScreenActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}