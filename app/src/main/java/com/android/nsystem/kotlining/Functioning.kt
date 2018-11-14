package com.android.nsystem.kotlining

/*
* By Putra Nugraha
*/

class Functioning : DataTypeing(){
    fun addAngka(addValue: Int = 0) : Int = getAngka() + addValue
    fun substractAngka(substractValue: Int = 0) : Int = getAngka() - substractValue
    fun addNilaiFloat(addValue: Float = 0F) : Float = getNilaiFloat() + addValue
    fun substractNilaiFloat(substractValue: Float = 0F) : Float = getNilaiFloat() - substractValue
    fun addNilaiDouble(addValue: Double = 0.0) : Double = getNilaiDouble() + addValue
    fun substractNilaiDouble(substractValue: Double = 0.0) : Double = getNilaiDouble() - substractValue
    fun customAdd(firstValue: Int = 0, secondValue: Int = 0) : Int = firstValue + secondValue

    fun getAngkaOperation() : String {
        val addResult : String = "Hasil tambah " + addAngka(addValue = 5).toString()
        val substractResult : String = "Hasil kurang " + substractAngka(substractValue = 5)
        return  addResult + " - " + substractResult
    }

    fun getNilaiFloatOperation() : String {
        val addResult : String = "Hasil tambah " + addNilaiFloat(addValue = 5.5F).toString()
        val substractResult : String = "Hasil kurang " + substractNilaiFloat(substractValue = 5.5F)
        return  addResult + " - " + substractResult
    }

    fun getNilaiDoubleOperation() : String {
        val addResult : String = "Hasil tambah " + addNilaiDouble(addValue = 5.98172).toString()
        val substractResult : String = "Hasil kurang " + substractNilaiDouble(substractValue = 5.98172)
        return  addResult + " - " + substractResult
    }
}