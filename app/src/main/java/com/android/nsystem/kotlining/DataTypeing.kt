package com.android.nsystem.kotlining

/*
* By Putra Nugraha
*/

open class DataTypeing {
    //variable Integer dengan isi 0
    private var angka : Int = 100

    //variable String, val means it is final (readonly)
    private val kotaTinggal : String = "Pekanbaru"

    //variable Float
    private var nilaiFloat : Float = 3.45F

    //variable Double
    private var nilaiDouble : Double = 34.5684

    fun getAngka() : Int = angka
    fun getKotaTinggal() : String = kotaTinggal
    fun getNilaiFloat() : Float = nilaiFloat
    fun getNilaiDouble() : Double = nilaiDouble
}