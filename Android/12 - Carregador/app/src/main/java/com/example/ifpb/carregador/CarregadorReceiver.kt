package com.example.ifpb.carregador

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class CarregadorReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.i("APPR", intent.action)

        if (intent.action == Intent.ACTION_POWER_CONNECTED){
            Toast.makeText(context, "Carregando", Toast.LENGTH_SHORT).show()
            //val it = Intent(context, MainActivity::class.java)
            val it = Intent("KERVEN")
            it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(it)
        }else{
            Toast.makeText(context, "Não Carregando", Toast.LENGTH_SHORT).show()
        }

        //throw UnsupportedOperationException("Not yet implemented")
    }
}
