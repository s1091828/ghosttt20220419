package com.example.ghosttt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.example.ghosttt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnTouchListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txv.text = "拖曳及碰撞偵測"
        binding.img1.setOnTouchListener(this)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        binding.txv.text = "觸控"

        if (event?.action == MotionEvent.ACTION_MOVE){
            v?.x = event.rawX - v!!.width/2
            v?.y = event.rawY - v!!.height/2
        }

        return true
    }
}