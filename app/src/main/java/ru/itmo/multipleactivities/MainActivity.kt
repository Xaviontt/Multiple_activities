package ru.itmo.multipleactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileButton: Button = findViewById(R.id.profileButton)
        val usersButton: Button = findViewById(R.id.usersButton)

        profileButton.setOnClickListener {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }

        usersButton.setOnClickListener {
            val intent = Intent(this, Users::class.java)
            startActivity(intent)
        }
    }
}