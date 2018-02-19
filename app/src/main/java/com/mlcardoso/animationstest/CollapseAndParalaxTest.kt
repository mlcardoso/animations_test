package com.mlcardoso.animationstest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.CollapsingToolbarLayout
import kotlinx.android.synthetic.main.activity_main.*

class CollapseAndParalaxTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(tool_bar)
        title = "Collapse and Parallax test"
    }
}