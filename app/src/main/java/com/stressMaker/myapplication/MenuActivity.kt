package com.stressMaker.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludaApp = findViewById<Button>(R.id.btnSaludaApp)
        btnSaludaApp.setOnClickListener() {
            navigateToSaludaApp()
        }
    }

    fun navigateToSaludaApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}