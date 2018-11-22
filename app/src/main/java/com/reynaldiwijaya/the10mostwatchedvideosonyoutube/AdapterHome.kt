package com.reynaldiwijaya.the10mostwatchedvideosonyoutube

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_video.view.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class AdapterHome (val context: FragmentHome2, val items: List<Item>) : RecyclerView.Adapter<AdapterHome.ViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_video, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bindItem(items[position])
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val namaVideo = view.txtTitleVideo
        val gambarVideo = view.imgVideo

        fun bindItem (item: Item){
            namaVideo.text = item.nama
            Glide.with(itemView.context).load(item.gambar).into(gambarVideo)

        }
    }

}