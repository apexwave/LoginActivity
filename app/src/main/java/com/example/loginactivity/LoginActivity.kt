package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        logIn()
    }

    private fun logIn() {
        val email = findViewById<TextInputEditText>(R.id.email_text)
        val password = findViewById<TextInputEditText>(R.id.password_text)
        val accepted = findViewById<MaterialButton>(R.id.next_button)


        accepted.setOnClickListener(){
            if (email.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Email or Password is not provided", Toast.LENGTH_SHORT).show()
            } else{
                if (email.text.toString() == "go@gmail.com" && password.text.toString() == "12345"){
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Email or Password provided is incorrect", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}