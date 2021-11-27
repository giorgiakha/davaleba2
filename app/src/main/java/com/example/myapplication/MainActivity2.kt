package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    val rightmeil = "akhalaiagiorgi.17@gmail.com"
    val rightpassword = "giorgi"
    private lateinit var meil:EditText
    private lateinit var password:EditText
    private lateinit var login: Button
    var name = "giorgi"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<TextView>(R.id.gio5).text = intent?.extras?.getString("მომხმარებლის სახელი","gamarjoba $name")
        meil = findViewById(R.id.gio4)
        password = findViewById(R.id.gio2)
        login = findViewById(R.id.gio3)

    }
    fun login(login:View){
        if (meil.text.toString()==rightmeil.toString()){
            if (password.text.toString()==rightpassword.toString()){
                Toast.makeText(this, "corect", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "incorect", Toast.LENGTH_SHORT).show()
            }
        }
        else{
            Toast.makeText(this, "თქვენი მეილი ან პაროლი არასწორია", Toast.LENGTH_SHORT).show()
        }
    }
}