package com.example.vehicleviewer

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vehicleviewer.databinding.ModeItemBinding

class ModeAdapter(val context: Context, var nameMode: ArrayList<ModeModel>) : RecyclerView.Adapter<ModeHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModeHolder {
        val binding: ModeItemBinding = ModeItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
             return ModeHolder(binding)
    }

    override fun onBindViewHolder(holder: ModeHolder, position: Int) {
        holder.binding.textViewNameTransports.text = nameMode[position].nameTransportsFromModeModel
        loadTransport(holder.binding.catalogWithModeTransports, nameMode[position].catalogWithModeTransports)
    }

    override fun getItemCount(): Int {
        return nameMode.size
    }

    private fun loadTransport(recyclerView:RecyclerView, typies: ArrayList<TypeModel>) {
        val typeAdapter = TypeAdapter(typies)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = typeAdapter
    }

}

class ModeHolder(val binding: ModeItemBinding): RecyclerView.ViewHolder(binding.root){
}