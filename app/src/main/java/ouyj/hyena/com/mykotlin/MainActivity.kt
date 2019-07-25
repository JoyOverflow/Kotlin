package ouyj.hyena.com.mykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

const val a=42;
const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    //private val _TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 1..1) {
            Log.d(TAG, i.toString())
        }


    }
}
