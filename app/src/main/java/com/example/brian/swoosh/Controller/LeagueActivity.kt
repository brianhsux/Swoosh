package com.example.brian.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.brian.swoosh.Model.Player
import com.example.brian.swoosh.R
import com.example.brian.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        leagueWomensBtn.isChecked = false
        leagueCoedBtn.isChecked = false

        if (leagueMensBtn.isChecked) {
            player.league = "Mens"
        } else {
            player.league = ""
        }

    }

    fun onWomensClicked(view: View) {
        leagueMensBtn.isChecked = false
        leagueCoedBtn.isChecked = false

        if (leagueWomensBtn.isChecked) {
            player.league = "Womens"
        } else {
            player.league = ""
        }
    }

    fun onCoedClicked(view: View) {
        leagueMensBtn.isChecked = false
        leagueWomensBtn.isChecked = false

        if (leagueCoedBtn.isChecked) {
            player.league = "Co-ed"
        } else {
            player.league = ""
        }
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }
}
