package com.unitec.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Quitar la action bar
     actionBar?.hide()




        ingresar.setOnClickListener {
            var i = Intent(this,Bienvenido::class.java)
            startActivity(i)
        }

    }
}
