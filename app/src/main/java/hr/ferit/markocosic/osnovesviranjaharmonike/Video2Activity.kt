package hr.ferit.markocosic.osnovesviranjaharmonike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri
import android.widget.MediaController

import android.widget.VideoView

class Video2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video2)

        val videoView = findViewById<VideoView>(R.id.videoView2)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.ljestvice
        val uri: Uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        findViewById<Button>(R.id.backButton2).setOnClickListener {
            val intent = Intent(this, ContentActivity::class.java)
            startActivity(intent)
        }
    }
}