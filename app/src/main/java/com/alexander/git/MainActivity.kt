package com.alexander.git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.text="0"
    }
    fun happy(v: View){
        var txv: TextView = findViewById(R.id.txv)
        txv.text = (1..100).random().toString()
    }
}