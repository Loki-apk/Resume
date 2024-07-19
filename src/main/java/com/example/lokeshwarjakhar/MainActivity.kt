package com.example.lokeshwarjakhar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intro: Button = findViewById(R.id.bintro)
        val educat: Button = findViewById(R.id.bexpert)
        val skills: Button = findViewById(R.id.bedu)
        val intern: Button = findViewById(R.id.bintern)
        val achiv: Button = findViewById(R.id.bachiv)
        val workshop: Button = findViewById(R.id.bseminar)
        val extra: Button = findViewById(R.id.bexc)
        val hobby: Button = findViewById(R.id.bpi)
        val resume: Button = findViewById(R.id.bresume)

        intro.setOnClickListener {
            startActivity(Intent(this, Introduction::class.java))
        }

        educat.setOnClickListener {
            startActivity(Intent(this, Education::class.java))
        }

        skills.setOnClickListener {
            startActivity(Intent(this, Skills::class.java))
        }

        intern.setOnClickListener {
            startActivity(Intent(this, Internship::class.java))
        }

        achiv.setOnClickListener {
            startActivity(Intent(this, Achivements::class.java))
        }

        workshop.setOnClickListener {
            startActivity(Intent(this, Workshops::class.java))
        }

        extra.setOnClickListener {
            startActivity(Intent(this, Extra::class.java))
        }

        hobby.setOnClickListener {
            startActivity(Intent(this, hobbies::class.java))
        }

        resume.setOnClickListener {
            startActivity(Intent(this, Complete::class.java))
        }
    }
}