package com.example.brian.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.brian.swoosh.Utilities.EXTRA_LEAGUE
import com.example.brian.swoosh.R
import com.example.brian.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }


    fun onSkillFinishClicked(view: View) {
        val finishActivity = Intent(this, FinishActivity::class.java)
        finishActivity.putExtra(EXTRA_LEAGUE, league)
        finishActivity.putExtra(EXTRA_SKILL, skill)
        startActivity(finishActivity)
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false

        skill = "Beginner"
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false

        skill = "Baller"
    }
}
