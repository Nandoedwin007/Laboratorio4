package com.example.laboratorio4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class Proyecto2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyecto2)

        val btnregresarp2 = findViewById<Button>(R.id.btnRegresarP2)
        //Funcion que abre la activity de MostrarMenu
        btnregresarp2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                finish()
            }
        })

        val webview2 = findViewById<WebView>(R.id.webView2)
        webview2.webViewClient = MyBrowser()
        webview2.loadUrl("https://github.com/Nandoedwin007/Laboratorio_2.git")


    }

    class MyBrowser:WebViewClient(){

        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }

    }



}
