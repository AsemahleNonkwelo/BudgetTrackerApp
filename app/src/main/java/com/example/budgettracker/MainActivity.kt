package com.example.budgetapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.budgetapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ViewBinding variable
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Logging to show the activity was loaded
        Log.d("MainActivity", "MainActivity loaded successfully")

        // Button click to navigate to LoginActivity
        binding.btnStart.setOnClickListener {
            Log.d("MainActivity", "Start button clicked")
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
