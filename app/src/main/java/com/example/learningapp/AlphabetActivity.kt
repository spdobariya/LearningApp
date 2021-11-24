package com.example.learningapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AlphabetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)

        var alpha = intent.getStringExtra("alpha")!!.lowercase()
        var iv = findViewById<ImageView>(R.id.imageView)

        var iid = resources.getIdentifier(alpha,"drawable",packageName)
        iv.setImageResource(iid)

        var mid = resources.getIdentifier(alpha,"raw",packageName)
        var mp = MediaPlayer.create(this,mid)
        mp.start()
    }
}