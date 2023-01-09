package com.example.prac1a

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var s:String
        var txtv=findViewById<View>(R.id.txtView) as TextView
        var txtp=findViewById<View>(R.id.txtEditName) as EditText
        var b=findViewById<View>(R.id.btnClick) as Button
        b.setOnClickListener{
            s=txtp.text.toString()
            txtv.setText("Hello "+s)
            Toast.makeText(this,"Hello "+s, Toast.LENGTH_LONG).show()
        }

    }
}