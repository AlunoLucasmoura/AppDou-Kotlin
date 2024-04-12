package com.example.appduo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.utils.ViewTimeCycle
import com.google.android.material.tabs.TabLayout.ViewPagerOnTabSelectedListener

class MainActivity : AppCompatActivity(), View.OnClickListener
{
    private lateinit var bindind: ActivityMainBinding
    private lateinit var  SecurityPreferences:
    SecurityPreferences
    private var filter: Int = MotivationConstants.PHRASEFILTER.GERAL
    private val mock: Mock = Mock()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}
