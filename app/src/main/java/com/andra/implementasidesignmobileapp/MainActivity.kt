package com.andra.implementasidesignmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try{
            this.supportActionBar?.hide()
        } catch (e:NullPointerException) {}
        setContentView(R.layout.activity_main)

        Glide.with(this)
            .load(R.drawable.player1)
            .circleCrop()
            .into(player1)

        Glide.with(this)
            .load(R.drawable.player2)
            .circleCrop()
            .into(player2)

        Glide.with(this)
            .load(R.drawable.player3)
            .circleCrop()
            .into(player3)

    }
}