package com.example.ghosttt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ghosttt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txv.text = "拖曳及碰撞偵測"
    }
}