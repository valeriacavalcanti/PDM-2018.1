package com.example.ifpb.starwars

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MensagemReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Que a força esteja com você!", Toast.LENGTH_SHORT).show()
    }
}
