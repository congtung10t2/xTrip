package com.xtrip.xtripandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TabHost
import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTabHost
import android.widget.TextView
import android.widget.TabWidget
import com.xtrip.xtripandroid.ui.MyPlanFragment


class MainActivity : FragmentActivity() {
    var tabHost: FragmentTabHost? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView();

    }

    fun initView(){
        val tabHost = findViewById(android.R.id.tabhost) as FragmentTabHost
        tabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("", resources.getDrawable(R
                .drawable.tab_selector)), MyPlanFragment::class.java, null)
        val widget = tabHost.tabWidget
        for (i in 0..widget.childCount - 1) {
            val v = widget.getChildAt(i)

            // Look for the title view to ensure this is an indicator and not a divider.
            val tv = v.findViewById(android.R.id.title) as TextView ?: continue
            v.setBackgroundResource(R.drawable.tab_selector_under_line)
        }
    }
}
