package com.example.ladm_practica2_juegodeburbujas_dghc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var Lienzo  : Lienzo ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Lienzo = Lienzo(this)
        setContentView(Lienzo!!)
        HiloAnimacion(this).start()
    }
}
