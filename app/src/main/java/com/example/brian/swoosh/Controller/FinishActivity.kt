package com.example.brian.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.brian.swoosh.R
import com.example.brian.swoosh.Utilities.EXTRA_LEAGUE
import com.example.brian.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var league = intent.getStringExtra(EXTRA_LEAGUE)
        var skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}
