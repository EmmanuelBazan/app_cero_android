package com.stressMaker.myapplication.imccalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.stressMaker.myapplication.R

class ImcCalculatorActivity : AppCompatActivity() {
    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView

    private var isMale:Boolean = true
    private  var isFemale:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)

        initComponents()
        initListeners()
    }

    private fun initComponents() {
        viewMale = findViewById(R.id.cardMale)
        viewFemale = findViewById(R.id.cardFemale)
    }

    private fun initListeners() {
        viewMale.setOnClickListener { setGenderColor(false) }
        viewFemale.setOnClickListener { setGenderColor(true) }
    }

    private fun setGenderColor(isMacho:Boolean) {
        val colorSelected = ContextCompat.getColor(this,R.color.background_component_selected)
        val colorUnselected = ContextCompat.getColor(this,R.color.background_component)

        if(isMacho) {
            viewMale.setCardBackgroundColor(colorUnselected)
            viewFemale.setCardBackgroundColor(colorSelected)
        } else {
            viewFemale.setCardBackgroundColor(colorUnselected)
            viewMale.setCardBackgroundColor(colorSelected)
        }
    }
}