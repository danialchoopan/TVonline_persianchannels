package ir.danial.choopan.tvonlinepersianchannels.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ir.danial.choopan.tvonlinepersianchannels.R
import ir.danial.choopan.tvonlinepersianchannels.model.TVchannle
import kotlinx.android.synthetic.main.activity_home.view.*
import kotlinx.android.synthetic.main.row_racycler_view_channels.view.*

class Adapter_recyclerView_channels(val tv_channels:ArrayList<TVchannle>,val onClick:(tv_channel:TVchannle)->Unit) :
    RecyclerView.Adapter<Adapter_recyclerView_channels.holder>() {
    inner class holder(val view: View):RecyclerView.ViewHolder(view){
        var txt_name:TextView=view.lbl_channel_name_row
        var btn_favorite:TextView=view.btn_favorite_row
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder {
        return holder(LayoutInflater.from(parent.context).inflate(R.layout.row_racycler_view_channels,parent,false))
    }

    override fun getItemCount(): Int =tv_channels.size

    override fun onBindViewHolder(holder: holder, position: Int) {
        holder.txt_name.text=tv_channels[position].name
        if(tv_channels[position].favorite)
            holder.btn_favorite.text="علاقه مندی"
        else
            holder.btn_favorite.text="افزودن به علاقه مندی"
        holder.view.setOnClickListener {
            onClick(tv_channels[position])
        }
    }
}