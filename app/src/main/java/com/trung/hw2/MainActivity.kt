package com.trung.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val foods = arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        btn_decide.setOnClickListener {
            tv_food_name.text  = foods[Random.nextInt(0, foods.size)]
        }

        btn_add_photo.setOnClickListener {
            val newFood = edt_add_food.text.toString().trim()
            tv_food_name.text = newFood
        }
    }
}