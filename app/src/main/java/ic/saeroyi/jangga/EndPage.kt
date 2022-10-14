package ic.saeroyi.jangga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class EndPage : AppCompatActivity() {

    private lateinit var webE: WebView
    private val URL = "file:///android_asset/lakay.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_page)

        webE = findViewById(R.id.webE)
        webE.apply {
            loadUrl(URL)
        }
    }
}