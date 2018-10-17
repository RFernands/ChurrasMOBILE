package net.catito.churrascore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)
        GlideApp.with( this)
                .load( "https://cdn3.iconfinder.com/data/icons/4th-of-july-1/64/Grill-512.png")
                .into(imgLogoApp)

        Handler().postDelayed({
            val inicio = Intent (this, MainActivity::class.java)
            startActivity(inicio)
            finish()
        }, 2000)
    }
}
