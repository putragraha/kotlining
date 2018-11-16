package com.android.nsystem.kotlining

/*
* By Putra Nugraha
*/

class Iterating : Functioning() {

    override fun getRandomValue(vararg values: Int) : String {
        var result = "Berikut nilai terbentuk : "
        for (value in values) {
            result += "${value} "
        }
        return result
    }

    fun getOrderedValueFromWhile(totalIteration: Int) : String {
        var result = "Berikut nilai terbentuk : "
        var count = 0
        while (count < totalIteration) {
            result += "${count} "
            count++
        }
        return result
    }

    fun getOrderedValueFromDo(totalIteration: Int) : String {
        var result = "Berikut nilai terbentuk : "
        var count = 1
        do {
            result += "${count} "
            count++
        } while (count < totalIteration)
        return result
    }
}