package com.example.uts1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WebFakultas : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.web_view)
        val webView = findViewById<WebView>(R.id.webView)
        val intentThatStartedThisActivity = intent

        if (intentThatStartedThisActivity.hasExtra(Intent.ACTION_VIEW)) {
            val webF = intentThatStartedThisActivity.getStringExtra(Intent.ACTION_VIEW)
            webView.settings.javaScriptEnabled = true
            webView.webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView, url: String) {
                    view.loadUrl("javascript:alert('Showing...')")
                }
            }
            webView.webChromeClient = object : WebChromeClient() {
                override fun onJsAlert(
                    view: WebView,
                    url: String,
                    message: String,
                    result: JsResult
                ): Boolean {
                    Toast.makeText(this@WebFakultas, message, Toast.LENGTH_LONG).show()
                    result.confirm()
                    return true
                }
            }
                webView.loadUrl(webF.toString())
        }
    }
}