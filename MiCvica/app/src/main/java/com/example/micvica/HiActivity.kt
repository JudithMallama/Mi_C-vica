package com.example.micvica

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.micvica.databinding.ActivityHiBinding

class HiActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var hibinding: ActivityHiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hibinding = ActivityHiBinding.inflate(layoutInflater)
        setContentView(hibinding.root)

        ingresomain()


        hibinding.registarButton.setOnClickListener { view ->
            val intent = Intent(this, RegisterActivity::class.java)
            //intent.putExtra("email", hibinding.userNameTextInputEditText.text.toString())
            startActivity(intent)
            finish()
        }
    }
    fun ingresomain()
    {
        var user = hibinding.userNameTextInputEditText.text.toString()
        var pass = hibinding.passwordTextInputEditText.text.toString()

        hibinding.loginButton.setOnClickListener { view ->

            if (hibinding.userNameTextInputEditText.text.toString().isEmpty()||hibinding.passwordTextInputEditText.text.toString().isEmpty()) {
                Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, NavActivity::class.java)
                intent.putExtra("email", hibinding.userNameTextInputEditText.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }

}