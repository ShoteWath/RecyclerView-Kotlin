package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView:RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val albums = ArrayList<Album>()
        albums.add(Album("Album Hits 1990",21,R.drawable.album_1))
        albums.add(Album("Album Hits 2002",25,R.drawable.album_2))
        albums.add(Album("Album Hits 2014",16,R.drawable.album_3))
        albums.add(Album("Album Hits 2016",8,R.drawable.album_4))
        albums.add(Album("Album Hits 2019",12,R.drawable.album_5))

        val adapter = AdapterAlbum(albums)

        recyclerView.adapter = adapter

    }
}
