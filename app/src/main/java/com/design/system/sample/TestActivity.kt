package com.design.system.sample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import com.design.system.sample.databinding.ActivityMainBinding

class TestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.navigate.setOnClickListener {
            startActivity(Intent(this, TestCodeInflationActivity::class.java))
        }

        binding.darkThemeSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                delegate.localNightMode = MODE_NIGHT_YES
            } else {
                delegate.localNightMode = MODE_NIGHT_NO
            }
        }
    }
}
