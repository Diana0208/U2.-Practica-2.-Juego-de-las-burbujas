package com.example.ladm_practica2_juegodeburbujas_dghc

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {

    var puntero = p

    //Grandes
    var circulo = Burbuja(150, 150, 150)
    var circulo1 = Burbuja(500, 800, 150)

    //Medianas
    var circulo2 = Burbuja(10, 150, 100)
    var circulo3 = Burbuja(200, 600, 100)

    //Pequeñas
    var circulo4 = Burbuja(700, 40, 50)
    var circulo5 = Burbuja(8, 20, 50)



    var punteroBurbuja: Burbuja? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.rgb(6,190,220))

        //circulo
        paint.color = Color.rgb(100,50,180)
        circulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo.pintar(canvas, paint)


        //circulo 1
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(15,35,110)
        circulo1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo1.pintar(canvas, paint)

        //circulo 2
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(10,135,79)
        circulo2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo2.pintar(canvas, paint)


        //circulo 3
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(182,115,53)
        circulo3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo3.pintar(canvas, paint)


        //circulo 4
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        circulo4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo4.pintar(canvas, paint)

        //circulo 5
        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        circulo5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo5.pintar(canvas, paint)


    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        //puntero.setTitle("")
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
            MotionEvent.ACTION_MOVE -> {
                if (punteroBurbuja != null) {
                    punteroBurbuja!!.arrastrar(event)

                }

            }
            MotionEvent.ACTION_UP -> {
                punteroBurbuja = null
            }
        }
        invalidate()
        return true
    }

    fun animarCirculo() {
        circulo.rebote(width,height)
        circulo1.rebote(width,height)
        circulo2.rebote(width,height)
        circulo3.rebote(width,height)
        circulo4.rebote(width,height)
        circulo5.rebote(width,height)
        invalidate()
    }

}