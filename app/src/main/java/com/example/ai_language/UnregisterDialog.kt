package com.example.ai_language

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater

class UnregisterDialog(context: Context) : Dialog(context){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.activity_unregister_dialog, null)
        setContentView(view)
    }

}