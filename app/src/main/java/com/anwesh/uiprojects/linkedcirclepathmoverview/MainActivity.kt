package com.anwesh.uiprojects.linkedcirclepathmoverview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.anwesh.uiprojects.circlepathmoverview.CirclePathMoverView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : CirclePathMoverView = CirclePathMoverView.create(this)
        fullScreen()
        view.addAnimationCompletionListener({createToast("animation ${it + 1} completed")}, {createToast("animation ${it + 1} is reset")})

    }

    fun createToast(txt : String) {
        Toast.makeText(this, txt, Toast.LENGTH_SHORT).show()
    }
}

fun MainActivity.fullScreen() {
    supportActionBar?.hide()
    window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
}