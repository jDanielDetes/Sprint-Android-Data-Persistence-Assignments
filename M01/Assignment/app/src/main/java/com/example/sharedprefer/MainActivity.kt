package com.example.sharedprefer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var bookList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun buildItemView(book: Book): TextView {
        val view = TextView(this)
        view.text = book.title
        view.textSize = 24f
        return view
    }
    }

