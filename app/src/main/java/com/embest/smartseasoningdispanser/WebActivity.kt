package com.embest.smartseasoningdispanser.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.embest.smartseasoningdispanser.R
import com.embest.smartseasoningdispanser.databinding.ActivityMainBinding
import com.embest.smartseasoningdispanser.databinding.ActivityWebBinding

class WebActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWebBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contents1 = intent.getIntExtra("contents1",0)
        val contents2 = intent.getIntExtra("contents2",0)
        val contents3 = intent.getIntExtra("contents3",0)
        val contents4 = intent.getIntExtra("contents4",0)

        //https://test.com?a=120?b=100
        val url = "https://test.com" + "?a=" + contents1 + "?b="+ contents2 + "?c=" + contents3 + "?d="+ contents4
        binding.webview.loadUrl(url)
    }
}