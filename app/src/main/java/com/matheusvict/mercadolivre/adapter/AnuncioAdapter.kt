package com.matheusvict.mercadolivre.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.matheusvict.mercadolivre.databinding.AnuncioItemBinding
import com.matheusvict.mercadolivre.model.Announcement

class AnuncioAdapter(private val context: Context, val anunciosList: MutableList<Announcement>): RecyclerView.Adapter<AnuncioAdapter.AnuncioViewHolder>() {

    inner class AnuncioViewHolder(binding: AnuncioItemBinding): RecyclerView.ViewHolder(binding.root) {
        val imgAnuncio = binding.anuncio
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnuncioViewHolder {
        val itemList = AnuncioItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return AnuncioViewHolder(itemList)
    }

    override fun getItemCount(): Int = anunciosList.size

    override fun onBindViewHolder(holder: AnuncioViewHolder, position: Int) {
        holder.imgAnuncio.setImageResource(anunciosList[position].img!!)
    }
}