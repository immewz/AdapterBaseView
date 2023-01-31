package com.padcmyanmar.mewz.adapterbaseview.activites

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.mewz.adapterbaseview.R

class NewDetailActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context: Context) : Intent {
            return Intent(context,NewDetailActivity::class.java)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_detail)
    }
}