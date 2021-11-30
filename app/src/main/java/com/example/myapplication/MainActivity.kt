package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editText3: EditText
    private lateinit var button: Button
    var name = "გიორგი"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText3 = findViewById(R.id.editText3)
        button = findViewById(R.id.button1)

        button.setOnClickListener {
            val ragaca3 =editText3.text.toString()
            val intent = Intent(this,MainActivity2:: class.java)
            if (ragaca3.isEmpty()){
                intent.putExtra("მომხმარებლის სახელი"," $name")
            }
            else{
                intent.putExtra("მომხმარებლის სახელი", ragaca3)
            }


            startActivity(intent)
        }
    }
}