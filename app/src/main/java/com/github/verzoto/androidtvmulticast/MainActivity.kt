package com.github.verzoto.androidtvmulticast

import android.media.AudioManager
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "udp://239.0.0.20:1234" // your URL here
        val mediaPlayer: MediaPlayer? = MediaPlayer().apply {
            setDataSource(url)
            prepare() // might take long! (for buffering, etc)
            start()
        }
    }
}
