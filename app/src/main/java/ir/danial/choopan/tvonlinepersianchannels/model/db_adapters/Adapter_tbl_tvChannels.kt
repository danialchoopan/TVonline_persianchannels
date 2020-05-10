package ir.danial.choopan.tvonlinepersianchannels.model.db_adapters

import android.annotation.SuppressLint
import android.content.Context
import happy.hidden.ir.storydatabase.DBmainclass
import ir.danial.choopan.tvonlinepersianchannels.model.TVchannle

class Adapter_tbl_tvChannels(val m_content: Context) : DBmainclass(m_content) {
    private val tbl_tvChannels = "tvChannels";

    @SuppressLint("Recycle")
    fun get_channels():ArrayList<TVchannle> {
        val cursor = database.rawQuery("SELECT * FROM $tbl_tvChannels ", null)
        val tv_channels = ArrayList<TVchannle>()
        if (cursor.moveToFirst()) {
            do {
                tv_channels.add(
                    TVchannle(
                        cursor.getInt(cursor.getColumnIndex("id")),
                        cursor.getString(cursor.getColumnIndex("name")),
                        cursor.getString(cursor.getColumnIndex("description")),
                        cursor.getString(cursor.getColumnIndex("stream_url")),
                        cursor.getInt(cursor.getColumnIndex("favorite"))
                    )
                )
            } while (cursor.moveToNext())
        }//end if
        return tv_channels
    }//end fun get_channels
}