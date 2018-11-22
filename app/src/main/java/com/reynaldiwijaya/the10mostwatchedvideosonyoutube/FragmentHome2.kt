package com.reynaldiwijaya.the10mostwatchedvideosonyoutube

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import kotlinx.android.synthetic.main.fragment_home.*
import org.jetbrains.anko.support.v4.startActivity

class  FragmentHome2 : Fragment() {
    val items: MutableList<Item> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val namaVideo = resources.getStringArray(R.array.namaVideo)
        val detailVideo = resources.getStringArray(R.array.videoDetail)
        val gambarVideo = resources.obtainTypedArray(R.array.gambarVideo)

        for (i in namaVideo.indices) {
            items.add(Item(namaVideo[i], detailVideo[i], gambarVideo.getResourceId(i, 0)))

        }


            return view
        }

        override fun onActivityCreated(savedInstanceState: Bundle?) {
            recyclerview.layoutManager = GridLayoutManager(context, 2)
            recyclerview.adapter = AdapterHome(this, items)

            super.onActivityCreated(savedInstanceState)
        }

}
