package com.github.verzoto.androidtvmulticast

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uri = Uri.parse("udp://224.0.0.1:9999");
        val video = findViewById<VideoView>(R.id.videoView);
        video.setVideoURI(uri);
        video.start();
    }
}
