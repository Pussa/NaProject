package com.example.naproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.naproject.feature.mainMenu.ui.MainMenuFragment

class MainActivity : AppCompatActivity() {

    private val TAG = "TestActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
                .add(R.id.container, MainMenuFragment())
                .commit()
    }


}