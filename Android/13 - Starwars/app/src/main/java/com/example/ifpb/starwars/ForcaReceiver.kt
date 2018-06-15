package com.example.ifpb.starwars

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ForcaReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val it = Intent(context, MainActivity::class.java)
        it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(it)
    }

}
