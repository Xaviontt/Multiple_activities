package ru.itmo.multipleactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)

        val actionBar = supportActionBar

        actionBar!!.title = "Profile"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}