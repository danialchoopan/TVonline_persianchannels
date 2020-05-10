package ir.danial.choopan.tvonlinepersianchannels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        splash_img_show.animation= AnimationUtils.loadAnimation(this@MainActivity,R.anim.splash_anim_img_show)
        splash_txt_right.animation=AnimationUtils.loadAnimation(this@MainActivity,R.anim.splash_anim_txt_right)
        splash_txt_left.animation=AnimationUtils.loadAnimation(this@MainActivity,R.anim.splash_anim_txt_left)
    }
}
