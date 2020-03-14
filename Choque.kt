package com.example.ladm_practica2_juegodeburbujas_dghc

class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(10)
            puntero.runOnUiThread {
                puntero.Lienzo!!.animarCirculo()

            }
        }
    }
}