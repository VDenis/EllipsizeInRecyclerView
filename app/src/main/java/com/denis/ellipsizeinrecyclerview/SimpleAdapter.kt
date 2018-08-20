package com.denis.ellipsizeinrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Denis Vlasov on 17/08/2018.
 */
class SimpleAdapter : RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>() {

    private val items: MutableList<UIEventModel> = mutableListOf()

    fun addItems(newItems: List<UIEventModel>) {
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder =
            SimpleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))

    override fun getItemCount(): Int = items.count()

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        val currentItem = items[position]

        with(holder) {
            //tvName.setText(currentItem.name)

            tvName.setText(currentItem.name, Utils.getEngArtistName(currentItem.name))
            tvDate.text = currentItem.date
            tvPrice.text = currentItem.price
        }
    }

    class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val tvName: TextView = itemView.findViewById(R.id.tvName)

        val tvName: CustomEllipsizeTextView = itemView.findViewById(R.id.tvName)
        val tvDate: TextView = itemView.findViewById(R.id.tvDate)
        val tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
    }

}