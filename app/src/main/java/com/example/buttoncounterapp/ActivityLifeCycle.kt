package com.example.buttoncounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


private val msg = "Main Activity"

class ActivityLifeCycle : AppCompatActivity() {
    private var btn : Button?= null
    private var count : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(msg,"OnCreate Method Called!!")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        var input = findViewById<EditText>(R.id.editText)
        btn = findViewById<Button>(R.id.button)
        var output : TextView = findViewById<TextView>(R.id.textView)
        output.text =""
        output.movementMethod = ScrollingMovementMethod()
        btn?.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                Log.d(msg,"OnClick Method Called!!")
                output.append("Number of times clicked is $count\n")
                output.append("${input.text}\n")
                count += 1
                input.text.clear()
//                input.setText("")
            }
        })
    }
}