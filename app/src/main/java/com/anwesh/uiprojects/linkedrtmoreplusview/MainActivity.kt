package com.anwesh.uiprojects.linkedrtmoreplusview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.rtmoreplusview.RtMorePlusView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RtMorePlusView.create(this)
    }
}
