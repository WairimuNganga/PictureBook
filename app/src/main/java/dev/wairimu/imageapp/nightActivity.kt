package dev.wairimu.imageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nightActivity : AppCompatActivity() {
    lateinit var btnNightPrevious: Button
    lateinit var btnNightNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_night)
        btnNightPrevious=findViewById(R.id.btnNightPrevious)
        btnNightNext=findViewById(R.id.btnNightNext)
        btnNightPrevious.setOnClickListener {
            val intent = Intent(this,bookActivity::class.java)
            startActivity(intent)
        }
        btnNightNext.setOnClickListener {
            val intent = Intent(this,sunriseActivity::class.java)
            startActivity(intent)
        }
    }
}