package com.example.naproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_rocket_detail.*

class RocketDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rocket_detail)

        val rocket = intent.extras?.getSerializable("Rocket") as Rocket
        //val launch = intent.extras?.getString("Launches")

        rocketname.text = "Name: ${rocket.name}"
        Launches.text = "Launches: ${rocket.launches}"


    }
}