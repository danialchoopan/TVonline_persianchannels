package ir.danial.choopan.tvonlinepersianchannels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import ir.danial.choopan.tvonlinepersianchannels.adapters.Adapter_recyclerView_channels
import ir.danial.choopan.tvonlinepersianchannels.model.TVchannle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val ar_data= arrayListOf(
            TVchannle(1,"tv1","fasfsaf","fsafas",false),
            TVchannle(1,"tv1","fasfsaf","fsafas",false),
            TVchannle(1,"tv1","fasfsaf","fsafas",false),
            TVchannle(1,"tv1","fasfsaf","fsafas",true),
            TVchannle(1,"tv1","fasfsaf","fsafas",false),
            TVchannle(1,"tv1","fasfsaf","fsafas",true),
            TVchannle(1,"tv1","fasfsaf","fsafas",false),
            TVchannle(1,"tv1","fasfsaf","fsafas",false),
            TVchannle(1,"tv1","fasfsaf","fsafas",false),
            TVchannle(1,"tv1","fasfsaf","fsafas",false),
            TVchannle(1,"tv1","fasfsaf","fsafas",false),
            TVchannle(1,"tv1","fasfsaf","fsafas",false)
        )
        recyclerView_channles.layoutManager=LinearLayoutManager(this@HomeActivity,LinearLayout.VERTICAL,false)
        recyclerView_channles.adapter=Adapter_recyclerView_channels(ar_data) {
            Toast.makeText(this@HomeActivity,it.name,Toast.LENGTH_SHORT).show()
        }
    }
}
