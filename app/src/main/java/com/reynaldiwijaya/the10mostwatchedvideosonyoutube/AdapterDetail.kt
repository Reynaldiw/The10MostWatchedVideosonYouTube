package com.reynaldiwijaya.the10mostwatchedvideosonyoutube

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail.view.*

class AdapterDetail (val context: DetailFragment, val items: List<Item>) : RecyclerView.Adapter<AdapterDetail.ViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.fragment_detail, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bindItem(items[position])

    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val namaVideo = view.txtTitleVideoDetail
        val gambarVideo = view.imgLogoDetail
        val detailVideo = view.txtDetail

        fun bindItem (item: Item){
            namaVideo.text = item.nama
            detailVideo.text = item.detail
            Glide.with(itemView.context).load(item.gambar).into(gambarVideo)

        }
    }

}