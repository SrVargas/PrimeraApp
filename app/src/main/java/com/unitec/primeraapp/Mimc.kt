package com.unitec.primeraapp

class Mimc {


    //Vamos a generar el mettodo para calcular el imc muy sencillos

    fun calcular (peso:Float,altura:Float):Float{

        var imc = peso / (altura*altura)

        return imc

    }
}