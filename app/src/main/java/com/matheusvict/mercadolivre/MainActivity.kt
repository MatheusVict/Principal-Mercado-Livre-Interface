package com.matheusvict.mercadolivre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.matheusvict.mercadolivre.adapter.AnuncioAdapter
import com.matheusvict.mercadolivre.databinding.ActivityMainBinding
import com.matheusvict.mercadolivre.model.Announcement

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var anuncioAdapter: AnuncioAdapter
    private val anuncioList: MutableList<Announcement> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewAnuncios = binding.recyclerViewAds
        recyclerViewAnuncios.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewAnuncios.setHasFixedSize(true)
        anuncioAdapter = AnuncioAdapter(this, anuncioList)
        recyclerViewAnuncios.adapter = anuncioAdapter
        getAnuncios()
    }

    private fun getAnuncios() {
        val anuncio1 = Announcement(R.drawable.anuncio1)
        anuncioList.add(anuncio1)

        val anuncio2 = Announcement(R.drawable.anuncio2)
        anuncioList.add(anuncio2)

        val anuncio3 = Announcement(R.drawable.anuncio3)
        anuncioList.add(anuncio3)
    }
}