package com.mubaracktahir.calculator


/**
 * Created by Mubarak Tahir on 4/30/2020.
 * Mubby inc
 * mubarack.tahirr@gmail.com
 */
class Calculator {

    /*
    *
    * Accepted operations
    *
    */
    enum class Operation {
        ADD, SUB, DIV, MUL
    }

    /*
    *
    * Subtraction operation
    *
    * */
    fun sub(firstNumber: Double, secondNumber: Double): Double {
        return firstNumber - secondNumber;
    }


    /*
    *
    *  addition operation
    *
    * */

    fun add(firstNumber: Double,secondNumber: Double):Double{
        return  firstNumber + secondNumber;
    }

    /*
    *
    * Multiplication operation
    *
    * */

    fun mul(firstNumber: Double,secondNumber: Double):Double{
        return firstNumber * secondNumber;
    }

    /*
    *
    * Division operation
    *
    * */

    fun div(firstNumber: Double,secondNumber: Double):Double{
        return firstNumber / secondNumber;
    }


}