package com.example.budgettracker

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            if (username == "admin" && password == "1234") {
                // Successful login
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                // Start main dashboard activity here
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()


                Log.d("LoginActivity", "Login screen loaded successfully")

                loginButton.setOnClickListener {
                    Log.d("LoginActivity", "Login button clicked with username: ${usernameEditText.text}")
                    // Add login logic here
                }

                registerTextView.setOnClickListener {
                    Log.d("LoginActivity", "Navigating to Registration screen")
                    // Intent to RegisterActivity
                }





            }
        }
    }
}
