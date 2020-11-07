package com.example.uts1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_fakultas.*

class DetailFakultas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_fakultas)
        val intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            val imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            val nameF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            val deskF =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            val deskS =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            val webF =
                intentThatStartedThisActivity.getStringExtra((Intent.ACTION_PICK))
            val emailF =
                intentThatStartedThisActivity.getStringExtra((Intent.ACTION_CALL))
            imageFakultas.setImageResource(imgF)
            NamaFakultas.text = nameF
            DeskripsiFakultas.text = deskF
            Deskripsi.text = deskS
            web.text = webF
            email.text = emailF
            web.setOnClickListener {
                openWeb(webF.toString())
            }
            email.setOnClickListener {
                sendEmail(emailF.toString())
            }
        }
    }
        fun openWeb(url: String) {
            val showWebActivity = Intent(this, WebFakultas::class.java)
            showWebActivity.putExtra(Intent.ACTION_VIEW, url)
            startActivity(showWebActivity)
        }
         fun sendEmail(email: String) {
            val mailIntent = Intent(Intent.ACTION_SEND)
            mailIntent.data = Uri.parse("mailto:")
            mailIntent.type = "text/plain"

            mailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Do Not Reply")
            mailIntent.putExtra(Intent.EXTRA_TEXT, "Email Testing")
            startActivity(Intent.createChooser(mailIntent, "Select Client"))
        }
    }