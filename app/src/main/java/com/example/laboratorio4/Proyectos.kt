package com.example.laboratorio4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Proyectos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyectos)

        val btnregresar = findViewById<Button>(R.id.btnRegresar)
        //Funcion que abre la activity de MostrarMenu
        btnregresar.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                finish()
            }
        })

        val btnproy2 = findViewById<Button>(R.id.btnProy2)
        //Funcion que abre la activity de MostrarMenu
        btnproy2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                val intent = Intent(this@Proyectos, Proyecto2::class.java)
                startActivity(intent)
            }
        })

        val btnproy3 = findViewById<Button>(R.id.btnProy3)
        //Funcion que abre la activity de MostrarMenu
        btnproy3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                val intent = Intent(this@Proyectos, Proyecto3::class.java)
                startActivity(intent)
            }
        })


    }

}
