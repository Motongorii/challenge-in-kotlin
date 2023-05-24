package com.example.pitoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity : AppCompatActivity() {
    lateinit var mywebview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        mywebview = findViewById(R.id.myweb)
        var settings = mywebview.settings
        settings.javaScriptEnabled = true
        mywebview.loadUrl("https://www.emobolis.ac.ke")
    }
}