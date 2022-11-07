package com.iggy.eritori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_top.*

class TopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)

        explanation_button.setOnClickListener {

        }
        game_list_button.setOnClickListener {
            startActivity(Intent(this, GmaeListActivity::class.java))
            overridePendingTransition(0, 0)
        }
        ranking_button.setOnClickListener {

        }
        ranking_register_button.setOnClickListener {

        }
    }
}