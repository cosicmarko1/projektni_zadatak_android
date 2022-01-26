package hr.ferit.markocosic.osnovesviranjaharmonike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        findViewById<Button>(R.id.button1).setOnClickListener {
            val intent = Intent(this, Video1Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val intent = Intent(this, Video2Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            val intent = Intent(this, Video3Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button4).setOnClickListener {
            val intent = Intent(this, Video4Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button5).setOnClickListener {
            val intent = Intent(this, Video5Activity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.homeButton).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}