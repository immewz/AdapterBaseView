package com.padcmyanmar.mewz.adapterbaseview.activites

import android.content.ClipData.newIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.mewz.adapterbaseview.Delegate.NewItemActionDelegate
import com.padcmyanmar.mewz.adapterbaseview.R
import com.padcmyanmar.mewz.adapterbaseview.adapter.NewsAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),NewItemActionDelegate {

    private lateinit var adapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = NewsAdapter(this)
        rvNews.adapter = adapter
        rvNews.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }

    override fun onTopNews() {
        startActivity(NewDetailActivity.newIntent(this))
    }
}