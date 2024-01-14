package com.example.ai_language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            //최초 1회 적용 코드 추가 필요
            //val intent = Intent(this, TermsActivity::class.java)
            //startActivity(intent)
            //finish()

            val intent = Intent(this, NewsActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}