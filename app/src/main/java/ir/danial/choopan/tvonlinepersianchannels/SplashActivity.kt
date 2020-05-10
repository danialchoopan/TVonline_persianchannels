package ir.danial.choopan.tvonlinepersianchannels

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splash_img_show.animation =
            AnimationUtils.loadAnimation(this@SplashActivity, R.anim.splash_anim_img_show)
        splash_txt_right.animation =
            AnimationUtils.loadAnimation(this@SplashActivity, R.anim.splash_anim_txt_right)
        splash_txt_left.animation =
            AnimationUtils.loadAnimation(this@SplashActivity, R.anim.splash_anim_txt_left)
        val connectivityManager =
            this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true
        if (!isConnected) {
            AlertDialog.Builder(this@SplashActivity).setTitle("اررور")
                .setMessage("برای استفاده از نرم افزار اتصال اینترنت لازم است لطفا اینترنت خود رو وصل کنید و دوباره امتحان کنید ")
                .setPositiveButton("باشه") { alert, wiche ->
                    finish()
                }.show()
        } else {
            Handler().postDelayed({
                startActivity(Intent(this, HomeActivity::class.java))
            }, 2000)
        }
    }
}
