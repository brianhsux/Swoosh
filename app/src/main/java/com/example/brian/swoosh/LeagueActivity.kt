package com.example.brian.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var leagueType = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        leagueWomensBtn.isChecked = false
        leagueCoedBtn.isChecked = false

        leagueType = "Mens"
    }

    fun onWomensClicked(view: View) {
        leagueMensBtn.isChecked = false
        leagueCoedBtn.isChecked = false

        leagueType = "Womens"
    }

    fun onCoedClicked(view: View) {
        leagueMensBtn.isChecked = false
        leagueWomensBtn.isChecked = false

        leagueType = "Co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (leagueType != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, leagueType)
            startActivity(skillActivity)
        }

    }
}
