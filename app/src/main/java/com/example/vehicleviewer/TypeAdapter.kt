package com.example.vehicleviewer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vehicleviewer.databinding.TypeItemBinding

class TypeAdapter(val typies: ArrayList<TypeModel>) : RecyclerView.Adapter<TypeAdapter.TypeHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypeHolder {
        val binding: TypeItemBinding = TypeItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return TypeHolder(binding)
    }

    override fun onBindViewHolder(holder: TypeHolder, position: Int) {
        holder.bind(typies[position])
    }

    override fun getItemCount(): Int {
        return typies.size
    }

    class TypeHolder(val binding: TypeItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(typeModel: TypeModel) {
            binding.contentCardOfTransport.setBackgroundResource(typeModel.banerType)
            binding.nameTransport.text = typeModel.nameTransport
            binding.weightTransport.text = typeModel.weightTransport
            binding.textFieldLoad.text = typeModel.textFieldLoad
        }
    }
}