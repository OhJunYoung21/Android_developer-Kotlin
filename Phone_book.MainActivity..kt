package com.example.phone_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var phonebook = MutableList<String>()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
