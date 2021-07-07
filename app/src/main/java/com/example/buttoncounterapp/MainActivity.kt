package com.example.buttoncounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var btn : Button?= null
    private var count : Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input = findViewById<EditText>(R.id.editText)
        btn = findViewById<Button>(R.id.button)
        var output : TextView = findViewById<TextView>(R.id.textView)
        output.text =""
        output.movementMethod = ScrollingMovementMethod()
        btn?.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                output.append("Number of times clicked is $count\n")
                output.append("${input.text}\n")
                count += 1
                input.text.clear()
//                input.setText("")
            }
        })
    }
}