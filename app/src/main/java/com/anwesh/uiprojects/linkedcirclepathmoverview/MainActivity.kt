package com.anwesh.uiprojects.linkedcirclepathmoverview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.circlepathmoverview.CirclePathMoverView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CirclePathMoverView.create(this)
    }
}
