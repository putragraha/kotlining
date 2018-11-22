package com.android.nsystem.kotlining.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.nsystem.kotlining.R
import kotlinx.android.synthetic.main.activity_second.*

/*
* By Putra Nugraha
*/

class SecondActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val isi = intent.getStringExtra("isi")
        textview_content.setText(isi)
    }
}