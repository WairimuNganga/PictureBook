package dev.wairimu.imageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnSahara:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSahara=findViewById(R.id.btnSahara)
        btnSahara.setOnClickListener {
            val intent = Intent(this,flowerActivity::class.java)
            startActivity(intent)
        }
    }
}