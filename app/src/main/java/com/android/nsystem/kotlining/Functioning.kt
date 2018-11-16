package com.android.nsystem.kotlining

/*
* By Putra Nugraha
*/

open class Functioning : DataTypeing(){
    fun addAngka(addValue: Int = 0) : Int = getAngka() + addValue
    fun substractAngka(substractValue: Int = 0) : Int = getAngka() - substractValue
    fun addNilaiFloat(addValue: Float = 0F) : Float = getNilaiFloat() + addValue
    fun substractNilaiFloat(substractValue: Float = 0F) : Float = getNilaiFloat() - substractValue
    fun addNilaiDouble(addValue: Double = 0.0) : Double = getNilaiDouble() + addValue
    fun substractNilaiDouble(substractValue: Double = 0.0) : Double = getNilaiDouble() - substractValue
    fun customAdd(firstValue: Int = 0, secondValue: Int = 0) : Int = firstValue + secondValue

    fun getAngkaOperation() : String {
        val addResult = "Hasil tambah ${addAngka(addValue = 5)}"
        val substractResult = "Hasil kurang ${substractAngka(substractValue = 5)}"
        return  "${addResult} - ${substractResult}"
    }

    fun getNilaiFloatOperation() : String {
        val addResult = "Hasil tambah ${addNilaiFloat(addValue = 5.5F)}"
        val substractResult = "Hasil kurang ${substractNilaiFloat(substractValue = 5.5F)}"
        return  "${addResult} - ${substractResult}"
    }

    fun getNilaiDoubleOperation() : String {
        val addResult = "Hasil tambah ${addNilaiDouble(addValue = 5.98172)}"
        val substractResult = "Hasil kurang ${substractNilaiDouble(substractValue = 5.98172)}"
        return "${addResult} - ${substractResult}"
    }

    open fun getRandomValue(vararg values: Int) : String {
        var result = "Berikut nilai terbentuk : "
        for (value in values) {
            result += "${value} "
        }
        return result
    }

    fun getRandomValueOwner(name : String, vararg values: String) : String {
        var result = ""
        for (value in values) {
            result += "${value} "
        }
        return "${name} memiliki nilai random ${result}"
    }

}