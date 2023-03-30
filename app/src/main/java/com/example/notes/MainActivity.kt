package com.example.notes

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.time.Year

class MainActivity : AppCompatActivity() {


    //var age: Long = 0;
    var age = 0
    val name = "John"
    lateinit var textView: TextView
    var textView2: TextView? = null
    var car: String? = null
    lateinit var editText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bundle: Bundle? = null

        val testModel = TestModel(12, "name", 2024)
        testModel.age = 12
        var a = testModel.age


        var drawable = textView.background
        textView.background = Drawable.createFromPath("")
        editText.setText(R.string.name)
        var textView3 = TextView(this)
        when (age) {
            10 -> {
                Toast.makeText(this, "10", Toast.LENGTH_SHORT).show()
            }
            50 -> {
                Toast.makeText(this, "50", Toast.LENGTH_SHORT).show()
            }
            else -> {

            }


        }

        bundle!!.putString("key", "123")
        var year: Int = setText(6, 6) ?: 0
//  textView = findViewById()

    }

    private fun setText(year: Int = 2022, day: Int): Int {
        return 0

    }
}