package com.example.ifpb.arretado

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btCampus: Button
    private lateinit var wvCampus: WebView
    private val CAMPUS = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btCampus = findViewById(R.id.btCampus)
        this.wvCampus = findViewById(R.id.wvCampus)

        this.btCampus.setOnClickListener({
            val it = Intent("ENDERECO_CAMPUS_IFPB")
            startActivityForResult(it, CAMPUS)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == CAMPUS) {
                val url = data?.getStringExtra("URL")
                this.wvCampus.loadUrl(url)
            }
        }
    }
}
