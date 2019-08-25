package com.example.employee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"We are in our pause Method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"We are in our Destroy Method")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"We are in our Resume Method")
    }


}
