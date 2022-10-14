package ic.saeroyi.jangga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class IntroPage : AppCompatActivity() {

    private lateinit var webI: WebView
    private val URL = "file:///android_asset/bbb.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_page)

        webI = findViewById(R.id.webI)
        webI.apply {
            loadUrl(URL)
        }
    }
}