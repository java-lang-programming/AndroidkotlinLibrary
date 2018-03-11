package com.java_lang_programming.android_kotlin_library

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.java_lang_programming.android_kotlin_library.kodein.article93.KodeinActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_kodein.setOnClickListener {
            moveKodeinActivity()
        }
        // KodeinActivity
    }

    private fun moveKodeinActivity() {
        startActivity(Intent(this, KodeinActivity::class.java))
    }
}
