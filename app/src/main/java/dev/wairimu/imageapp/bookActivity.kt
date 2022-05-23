package dev.wairimu.imageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bookActivity : AppCompatActivity() {
    lateinit var btnPreviousBook: Button
    lateinit var btnNextBook: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        btnPreviousBook=findViewById(R.id.btnPreviousBook)
        btnNextBook=findViewById(R.id.btnNextBook)
        btnPreviousBook.setOnClickListener {
            val intent = Intent(this,flowerActivity::class.java)
            startActivity(intent)
        }
        btnNextBook.setOnClickListener {
            val intent = Intent(this,nightActivity::class.java)
            startActivity(intent)
        }
    }
}

