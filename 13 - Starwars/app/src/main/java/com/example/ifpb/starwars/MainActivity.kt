package com.example.ifpb.starwars

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var msgR: MensagemReceiver
    private lateinit var itf: IntentFilter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.msgR = MensagemReceiver()
        this.itf = IntentFilter()
        this.itf.addAction(Intent.ACTION_USER_PRESENT)
    }

    // rodando
    override fun onResume() {
        super.onResume()
        registerReceiver(this.msgR, this.itf)
    }

    // vai parar
    override fun onPause() {
        super.onPause()
        unregisterReceiver(this.msgR)
    }
}
