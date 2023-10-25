package com.stressMaker.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.stressMaker.myapplication.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludaApp = findViewById<Button>(R.id.btnSaludaApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)

        btnSaludaApp.setOnClickListener() {
            navigateToSaludaApp()
        }

        btnImcApp.setOnClickListener() {
            navigateToImcApp()
        }
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludaApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}