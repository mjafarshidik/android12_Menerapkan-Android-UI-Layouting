package com.group3.layouting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.group3.layouting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        btnClick()
    }

    private fun btnClick() {
        mainBinding.apply {
            btnAmzes.setOnClickListener {
                val intent = Intent(this@MainActivity, AmzesmoroActivity::class.java)
                startActivity(intent)
            }
            btnSyafei.setOnClickListener {
                val intent = Intent(this@MainActivity, SyafeiActivity::class.java)
                startActivity(intent)
            }
            btnHendro.setOnClickListener {
                val intent = Intent(this@MainActivity, HendroActivity::class.java)
                startActivity(intent)
            }
            btnJafar.setOnClickListener {
                val intent = Intent(this@MainActivity, JafarActivity::class.java)
                startActivity(intent)
            }
        }
    }
}