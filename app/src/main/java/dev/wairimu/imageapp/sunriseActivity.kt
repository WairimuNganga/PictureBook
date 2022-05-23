package dev.wairimu.imageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sunriseActivity : AppCompatActivity() {
    lateinit var btnSunrisePrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunrise)
       btnSunrisePrevious=findViewById(R.id.btnSunrisePrevious)
        btnSunrisePrevious.setOnClickListener {
            val intent = Intent(this,nightActivity::class.java)
            startActivity(intent)
        }
    }
}