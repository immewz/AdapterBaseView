package com.padcmyanmar.mewz.adapterbaseview.activites

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.mewz.adapterbaseview.R

class SecondNewDetailActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context: Context) : Intent {
            return Intent(context,SecondNewDetailActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_new_detail)
    }
}