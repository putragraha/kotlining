package com.android.nsystem.kotlining

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val functioning : Functioning = Functioning()
    private val conditioning : Conditioning = Conditioning()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //menampilkan data double
        btn_double.setOnClickListener {
            tv.text = functioning.getNilaiDoubleOperation()
        }

        //menampilkan data integer
        btn_integer.setOnClickListener {
            tv.text = functioning.getAngkaOperation()
//            tv.text = functioning.customAdd(firstValue = 1, secondValue = 2).toString()
//            tv.text = functioning.customAdd(secondValue = 2, firstValue = 1).toString()
//            tv.text = functioning.customAdd(secondValue = 2).toString()
        }

        //menampilkan data string
        btn_string.setOnClickListener {
            tv.text = functioning.getRandomValueOwner("Putra", "1", "4", "7", "9", "12")
//            tv.text = functioning.getRandomValue(1, 4, 7, 9, 12)
//            tv.text = functioning.getKotaTinggal()
        }

        //menampilkan data float
        btn_float.setOnClickListener {
            tv.text = functioning.getNilaiFloatOperation()
        }

        btn_compare_value.setOnClickListener {
            tv.text = conditioning.compareValue(firstValue = 10, secondValue = 2)
        }

        btn_score.setOnClickListener {
            tv.text = conditioning.readScore(totalScore = 3)
        }

        btn_score_in_range.setOnClickListener {
            tv.text = conditioning.readScore(totalScore = 81)
        }
    }
}
