package com.example.brian.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.brian.swoosh.Model.Player
import com.example.brian.swoosh.R
import com.example.brian.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }


    fun onSkillFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        if (beginnerSkillBtn.isChecked) {
            player.skill = "Beginner"
        } else {
            player.skill = ""
        }
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        if (ballerSkillBtn.isChecked) {
            player.skill = "Baller"
        } else {
            player.skill = ""
        }
    }
}
