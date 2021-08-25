package com.example.micvica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.micvica.databinding.ActivityHiBinding
import com.example.micvica.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity()
{
    private lateinit var registerBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerBinding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(registerBinding.root)

        registerBinding.guardarRegistroButton.setOnClickListener {

            val name = registerBinding.userNameRegTextInputEditText.text.toString()
            val email = registerBinding.userEmailRegTextInputEditText.text.toString()
            val pass = registerBinding.passwordRegTextInputEditText.text.toString()
            val repass = registerBinding.repPasswordTextInputEditText.text.toString()

            if (name.isNotEmpty() && email.isNotEmpty() && pass.isNotEmpty() && repass.isNotEmpty())
            {
                registerBinding.userNameResgTextInputLayout.error = null
                registerBinding.userEmailRegTextInputLayout.error = null
                registerBinding.passwordTextInputLayout.error = null
                registerBinding.repPasswordTextInputLayout.error = null

                if (pass==repass) {
                    registerBinding.guardarRegistroButton.setOnClickListener {
                        val intent = Intent(this, NavActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
                else
                {
                    Toast.makeText(this,  "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()

                }
            }

            else
            {
                Toast.makeText(this,  "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
                if(name.isEmpty())
                {
                    registerBinding.userNameResgTextInputLayout.error = "Campo obligatorio"
                }
                else
                {
                    registerBinding.userNameResgTextInputLayout.error = null
                }
                if(email.isEmpty())
                {
                    registerBinding.userEmailRegTextInputLayout.error = "Campo obligatorio"
                }
                else
                {
                    registerBinding.userEmailRegTextInputLayout.error = null
                }
                if(pass.isEmpty())
                {
                    registerBinding.passwordTextInputLayout.error = "Campo obligatorio"
                }
                else
                {
                    registerBinding.passwordTextInputLayout.error = null
                }
                if(repass.isEmpty())
                {
                    registerBinding.repPasswordTextInputLayout.error = "Campo obligatorio"
                }
                else
                {
                    registerBinding.repPasswordTextInputLayout.error = null
                }
            }

            }
        }


    }
