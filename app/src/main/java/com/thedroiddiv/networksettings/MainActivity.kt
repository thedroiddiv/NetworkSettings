package com.thedroiddiv.networksettings

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            val intent = Intent("android.intent.action.MAIN")
            intent.setClassName("com.android.phone", "com.android.phone.settings.RadioInfo")
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(applicationContext, "Device not supported", Toast.LENGTH_SHORT).show()
        }
        finish()
    }
}
