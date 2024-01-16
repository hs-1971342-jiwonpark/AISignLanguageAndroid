package com.example.ai_language

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CallListAdapter (val itemList: ArrayList<CallListItem>) :
    RecyclerView.Adapter<CallListAdapter.CallListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.call_item, parent, false)
        return CallListViewHolder(view)
    }

    override fun onBindViewHolder(holder: CallListViewHolder, position: Int) {
        holder.name.text = itemList[position].name
        holder.phoneNumber.text = itemList[position].callNumber
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    inner class CallListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.name)
        val phoneNumber = itemView.findViewById<TextView>(R.id.phoneNumber)
    }
}