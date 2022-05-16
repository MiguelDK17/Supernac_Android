package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.login.R

class Let_It_Be : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_let_it_be)
        var btClique: Button
        var tvBeatles:TextView
        tvBeatles = findViewById(R.id.tvLet_it_Be)
        btClique = findViewById(R.id.Clique)
        btClique.setOnClickListener (View.OnClickListener {
                tvBeatles.text = "When I find myself in times of trouble \n Mother Mary comes to me \n Speaking words of wisdom\n Let it be\nAnd in my hour of darkness\n She is standing right in front of me\nSpeaking words of wisdom\nLet it be\nLet is be, let it be\nLet it be, let it be\nWhisper words of wisdom\nLet it be\nAnd when the brokenhearted people\nLiving in the world agree\nThere will be an answer\nLet it be\nFor though they may be parted\nThere is still a chance that they will see\nThere will be an answer\nLet it be\nLet is be, let it be\nLet it be, let it be\nYeah, there will be an answer\nLet it be\nLet is be, let it be\nLet it be, let it be\nWhisper words of wisdom\nLet it be\nLet is be, let it be\nLet it be, yeah, let it be\nWhisper words of wisdom\nLet it be\nAnd when the night is cloudy\nThere is still a light that shines on me\nShine on 'til tomorrow\nLet it be\nI wake up to the sound of music\nMother Mary comes to me\nSpeaking words of wisdom\nLet it be, yeah\nLet it be, let it be\nLet it be, yeah, let it be\nOh, there will be an answer\nLet it be\nLet it be, let it be\nLet it be, yeah, let it be\nWhisper words of wisdom\nLet it be"
        })
            tvBeatles.movementMethod = ScrollingMovementMethod.getInstance()

    }
}