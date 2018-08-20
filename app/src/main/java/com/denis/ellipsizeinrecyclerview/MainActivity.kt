package com.denis.ellipsizeinrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvNames: RecyclerView = findViewById(R.id.rvNames)
        val eventAdapter = SimpleAdapter()

        rvNames.layoutManager = LinearLayoutManager(this)
        rvNames.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rvNames.adapter = eventAdapter
        eventAdapter.addItems(Utils.getEvents())
    }
}
