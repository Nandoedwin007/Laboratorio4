package com.example.laboratorio4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class Proyecto3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyecto3)

        val btnregresarp3 = findViewById<Button>(R.id.btnRegresarP3)
        //Funcion que abre la activity de MostrarMenu
        btnregresarp3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                finish()
            }
        })

        val webview3 = findViewById<WebView>(R.id.webView3)
        webview3.webViewClient = Proyecto2.MyBrowser()
        webview3.loadUrl("https://github.com/Nandoedwin007/Laboratorio3.git")


    }
    class MyBrowser: WebViewClient(){

        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }

    }
}
