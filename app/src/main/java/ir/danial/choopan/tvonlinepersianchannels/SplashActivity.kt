package ir.danial.choopan.tvonlinepersianchannels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splash_img_show.animation= AnimationUtils.loadAnimation(this@SplashActivity,R.anim.splash_anim_img_show)
        splash_txt_right.animation=AnimationUtils.loadAnimation(this@SplashActivity,R.anim.splash_anim_txt_right)
        splash_txt_left.animation=AnimationUtils.loadAnimation(this@SplashActivity,R.anim.splash_anim_txt_left)
        Handler().postDelayed({
            startActivity(Intent(this,HomeActivity::class.java))
        },2000)
    }
}
