package com.example.birthday_greet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreeting : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name = intent.getStringExtra(NAME_EXTRA)

        birthdayGreet.text = "Happy Birthday\n$name"
    }
}