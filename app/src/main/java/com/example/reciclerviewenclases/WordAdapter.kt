package com.example.reciclerviewenclases

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.word_item_list.view.*

class WordAdapter(private var listadoPalabras:MutableList<String>): RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var textView : TextView = itemView.findViewById(R.id.textView2)
       // Lo de abajo es en Kotlin Synthetics //
        var textView1 : TextView = itemView.textView2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.word_item_list,parent,false)
        return WordViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return listadoPalabras.size
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.textView.text = listadoPalabras[position]
    }
}