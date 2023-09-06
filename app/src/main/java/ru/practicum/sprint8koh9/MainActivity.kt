package ru.practicum.sprint8koh9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    var lastOnStopTimestamp: Long? = null

    lateinit var pinCode: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "$this onCreate")
        pinCode = findViewById(R.id.pin_code)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$this onStart")
        val lastOnStopTimestamp = lastOnStopTimestamp ?: 0
        val delta: Long = System.currentTimeMillis() - lastOnStopTimestamp
        if (delta > 3000L) {
            pinCode.visibility = View.VISIBLE
            pinCode.setOnClickListener {
                pinCode.visibility = View.GONE
                // startAutoUpdate()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$this onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "$this onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$this onStop")
        lastOnStopTimestamp = System.currentTimeMillis()
        // stopAutoUpdate()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$this onDestroy")
    }

    companion object {
        const val TAG = "SPRINT_8"
    }
}