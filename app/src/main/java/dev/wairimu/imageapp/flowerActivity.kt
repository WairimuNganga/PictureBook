package dev.wairimu.imageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class flowerActivity : AppCompatActivity() {
    lateinit var btnPreviousFlower:Button
    lateinit var btnNextFlower:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower)
        btnPreviousFlower=findViewById(R.id.btnPreviousFlower)
        btnNextFlower=findViewById(R.id.btnNextFlower)
        btnPreviousFlower.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNextFlower.setOnClickListener {
            val intent = Intent(this,bookActivity::class.java)
            startActivity(intent)
        }
    }
}