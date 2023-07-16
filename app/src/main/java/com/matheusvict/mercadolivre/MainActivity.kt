package com.matheusvict.mercadolivre

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.matheusvict.mercadolivre.adapter.AnuncioAdapter
import com.matheusvict.mercadolivre.adapter.ProductAdapter
import com.matheusvict.mercadolivre.databinding.ActivityMainBinding
import com.matheusvict.mercadolivre.model.Announcement
import com.matheusvict.mercadolivre.model.Product

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var anuncioAdapter: AnuncioAdapter
    private lateinit var productAdapter: ProductAdapter
    private val anuncioList: MutableList<Announcement> = mutableListOf()
    private val productList: MutableList<Product> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#F7E64F")

        anunciosRecyclerViewInit()
        productsRecyclerViewInit()
    }

    private fun anunciosRecyclerViewInit() {
        val recyclerViewAnuncios = binding.recyclerViewAds
        recyclerViewAnuncios.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewAnuncios.setHasFixedSize(true)
        anuncioAdapter = AnuncioAdapter(this, anuncioList)
        recyclerViewAnuncios.adapter = anuncioAdapter
        getAnuncios()
    }

    private fun productsRecyclerViewInit() {
        val recyclerViewProducts = binding.recyclerViewProducts
        recyclerViewProducts.layoutManager = GridLayoutManager(this, 2)
        recyclerViewProducts.setHasFixedSize(true)
        productAdapter = ProductAdapter(this, productList)
        recyclerViewProducts.adapter = productAdapter
        getProducts()
    }

    private fun getAnuncios() {
        val anuncio1 = Announcement(R.drawable.anuncio1)
        anuncioList.add(anuncio1)

        val anuncio2 = Announcement(R.drawable.anuncio2)
        anuncioList.add(anuncio2)

        val anuncio3 = Announcement(R.drawable.anuncio3)
        anuncioList.add(anuncio3)
    }

    private fun getProducts() {
        val product1 = Product(
            R.drawable.computer,
            "R$ 10.000,00",
            "macbook novo lacrado",
            "Frete grátis"
            )
        productList.add(product1)

        val product2 = Product(
            R.drawable.xbox,
            "R$ 8.000,00",
            "Xbox series X 1tb",
            "Frete grátis"
            )
        productList.add(product2)

        val product3 = Product(
            R.drawable.smartphone,
            "R$ 700,00",
            "Celular Readmi",
            "Frete grátis"
            )
        productList.add(product3)
        val product4 = Product(
            R.drawable.shoes,
            "R$ 50,00",
            "Sapatos",
            "Frete grátis"
            )
        productList.add(product4)
    }
}