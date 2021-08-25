package com.example.micvica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.micvica.databinding.ActivityHelloBinding

class HelloActivity : AppCompatActivity()
{
    private lateinit var helloBinding: ActivityHelloBinding


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        setContentView(helloBinding.root)

        helloBinding.registarButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("email", helloBinding.userNameTextInputEditText.text.toString())
            startActivity(intent)
            finish()
        }



    }







}