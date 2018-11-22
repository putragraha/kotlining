package com.android.nsystem.kotlining.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.nsystem.kotlining.R
import kotlinx.android.synthetic.main.activity_first.*
import org.jetbrains.anko.*

/*
* By Putra Nugraha
*/

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        button_browse.setOnClickListener {
            browse(url = "http://www.google.com")
        }

        button_call.setOnClickListener {
            makeCall(number = "085265713525")
        }

        button_go_to_second_activity.setOnClickListener {
            startActivity<SecondActivity>("isi" to "Welcome to Second Activity");
        }

        button_send_email.setOnClickListener {
            email(email = "http://www.google.com", subject = "Test", text = "Test test test")
        }

        button_send_message.setOnClickListener {
            sendSMS(number = "085265713525", text = "Test")
        }

        button_share.setOnClickListener {
            share(text = "Test test test", subject = "Test")
        }
    }
}