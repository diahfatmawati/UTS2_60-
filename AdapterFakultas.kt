package com.example.uts1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.liast_fakultas.view.*

class AdapterFakultas (val itemFak: List<DataFakultas>, val clickListener: (DataFakultas) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.liast_fakultas, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFak[position], clickListener)
    }
    override fun getItemCount() = itemFak.size
    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(data : DataFakultas, clickListener: (DataFakultas) -> Unit){
            itemView.imageFak.setImageResource(data.imgFak)
            itemView.tv_list_fak.text = data.nameFak
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}