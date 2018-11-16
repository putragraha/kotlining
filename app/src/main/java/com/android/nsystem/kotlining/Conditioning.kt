package com.android.nsystem.kotlining

/*
* By Putra Nugraha
*/

class Conditioning {
    fun compareValue(firstValue : Int = 0, secondValue : Int = 0) : String {
        if (firstValue > secondValue)
            return "$firstValue bigger than $secondValue"
        else
            return "$secondValue bigger than $firstValue"
    }

    fun readScore(totalScore : Int = 0) : String {
        when (totalScore) {
            1 -> return "You got D"
            2 -> return "You got C"
            3 -> return "You got B"
            else -> return "You got A"
        }
    }

    fun readScoreInRange(totalScore : Int = 0) : String {
        when (totalScore) {
            in 0..50 -> return "You got D"
            in 51..70 -> return "You got C"
            in 71..80 -> return "You got B"
            else -> return "You got A"
        }
    }
}