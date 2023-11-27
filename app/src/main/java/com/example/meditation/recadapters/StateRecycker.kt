package com.example.meditation.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meditation.FeelRecycler
import com.example.meditation.R
import com.example.meditation.state

class StateRecycker(val context: Context, val state_list: ArrayList<state>) : RecyclerView.Adapter<StateRecycker.MyVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRecycker.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.state_adapter,parent,false)
        return MyVH(root)
    }

    class MyVH(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.state_img)
        val textView: TextView = itemView.findViewById(R.id.name1)
        val textView1: TextView = itemView.findViewById(R.id.name2)
    }

    override fun onBindViewHolder(holder: StateRecycker.MyVH, position: Int) {
        holder.image.setImageResource(state_list[position].image_state)
        holder.textView.setText(state_list[position].title)
        holder.textView1.setText(state_list[position].text_state)
    }

    override fun getItemCount(): Int {
        return state_list.size
    }
}