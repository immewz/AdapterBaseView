package com.padcmyanmar.mewz.adapterbaseview.activites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.mewz.adapterbaseview.R
import com.padcmyanmar.mewz.adapterbaseview.adapter.ViewPagerWithCustomViewAdapter
import kotlinx.android.synthetic.main.activity_viewpager_with_custom_view.*

class ViewPagerWithCustomViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager_with_custom_view)

        val viewPagerAdapter = ViewPagerWithCustomViewAdapter()
        viewpagerCustomView.adapter = viewPagerAdapter
    }
}