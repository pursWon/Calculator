package org.techtown.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText; lateinit var edit2 : EditText
    lateinit var btnAdd : Button; lateinit var btnSub : Button
    lateinit var btnMu1 : Button; lateinit var btnDiv : Button
    lateinit var TextResult : TextView

    lateinit var num1 : String; lateinit var num2 : String
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "내가 만든 계산기"

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)
        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMu1 = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)
        TextResult = findViewById<TextView>(R.id.TextResult)

        btnAdd.setOnTouchListener { view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            TextResult.text = "계산결과 : " + result.toString()
            false
        }
        btnDiv.setOnTouchListener { view, motionEvent ->
           num1 = edit1.text.toString()
           num2 = edit2.text.toString()
           result = Integer.parseInt(num1) / Integer.parseInt(num2)
            TextResult.text="계산결과 : " + result.toString()
            false
        }
    }
}