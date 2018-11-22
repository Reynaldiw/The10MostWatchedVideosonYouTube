package com.reynaldiwijaya.the10mostwatchedvideosonyoutube

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.detail_fragment.*

class DetailFragment : Fragment() {
    val items: MutableList<Item> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.detail_fragment, container, false)

        val namaVideo = resources.getStringArray(R.array.namaVideo)
        val detailVideo = resources.getStringArray(R.array.videoDetail)
        val gambarVideo = resources.obtainTypedArray(R.array.gambarVideo)

        for (i in namaVideo.indices){
            items.add(Item(namaVideo[i], detailVideo[i], gambarVideo.getResourceId(i,0)))
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        myRecyclerView.layoutManager = LinearLayoutManager(context)
        myRecyclerView.adapter = AdapterDetail(this, items)
        super.onActivityCreated(savedInstanceState)
    }
}