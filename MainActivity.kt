package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var botao: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.botao = findViewById(R.id.btnCliqueAqui)



        this.botao.setOnClickListener({clique(it)})

    }
    fun clique(view: View){
        var aleatorio = java.util.Random()
        Log.i("Testeapp", aleatorio.nextInt(60).toString())
        Log.i("Testeapp", aleatorio.nextInt(60).toString())
        Log.i("Testeapp", aleatorio.nextInt(60).toString())
        Log.i("Testeapp", aleatorio.nextInt(60).toString())
        Log.i("Testeapp", aleatorio.nextInt(60).toString())
        Log.i("Testeapp", aleatorio.nextInt(60).toString())
    }
}