package com.example.swoosh.controller

import android.annotation.SuppressLint
import android.os.Bundle
import com.example.swoosh.model.Player
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player?.league} ${player?.skill} league near you..."
    }
}