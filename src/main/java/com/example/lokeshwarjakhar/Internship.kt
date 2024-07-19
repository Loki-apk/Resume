package com.example.lokeshwarjakhar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class Internship : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.internship)
        val link: TextView = findViewById(R.id.textView9)

        link.setOnClickListener {
            startActivity(Intent(this, interncerti::class.java))
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.mhome->
            {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            R.id.mintro->
            {
                startActivity(Intent(this, Introduction::class.java))
                finish()
            }
            R.id.medu->
            {
                startActivity(Intent(this, Education::class.java))
                finish()
            }
            R.id.mskill->
            {
                startActivity(Intent(this, Skills::class.java))
                finish()
            }

            R.id.mintern->
            {
                startActivity(Intent(this, Internship::class.java))
                finish()
            }

            R.id.machive->
            {
                startActivity(Intent(this, Achivements::class.java))
                finish()
            }

            R.id.mseminar->
            {
                startActivity(Intent(this, Workshops::class.java))
                finish()
            }

            R.id.mextra->
            {
                startActivity(Intent(this, Extra::class.java))
                finish()
            }

            R.id.mresume->
            {
                startActivity(Intent(this, Complete::class.java))
                finish()
            }
            R.id.mresume->
            {
                startActivity(Intent(this, Complete::class.java))
                finish()
            }
        }
        return true
    }
}