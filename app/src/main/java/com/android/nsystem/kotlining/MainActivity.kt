package com.android.nsystem.kotlining

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val dataTypeing : DataTypeing = DataTypeing()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //menampilkan data double
        btn_double.setOnClickListener {
            tv.text = dataTypeing.getNilaiDouble().toString()
        }

        //menampilkan data integer
        btn_integer.setOnClickListener {
            tv.text = dataTypeing.getAngka().toString()
        }

        //menampilkan data string
        btn_string.setOnClickListener {
            tv.text = dataTypeing.getKotaTinggal()
        }

        //menampilkan data float
        btn_float.setOnClickListener {
            tv.text = dataTypeing.getNilaiFloat().toString()
        }

    }
}
