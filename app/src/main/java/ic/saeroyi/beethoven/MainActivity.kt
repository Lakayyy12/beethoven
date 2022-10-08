package ic.saeroyi.beethoven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var exit = 0
    private var btn1: Button? = null
    private var btn2: Button? = null
    private var btn3: Button? = null
    private var review: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        review = findViewById(R.id.review)
        review?.setOnClickListener {
            val intent = Intent(this, IntroPage::class.java)
            startActivity(intent)
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            review!!.startAnimation(animationSlideUp)
        }

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener {
            val intent = Intent(this, EndPage::class.java)
            startActivity(intent)
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            btn1!!.startAnimation(animationSlideUp)
        }

        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            btn2!!.startAnimation(animationSlideUp)
        }

        btn3 = findViewById(R.id.btn3)
        btn3?.setOnClickListener {
            val intent = Intent(this, DicePage::class.java)
            startActivity(intent)
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            btn3!!.startAnimation(animationSlideUp)
        }
    }

    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        } else {
            super.finishAffinity()
        }
    }
}