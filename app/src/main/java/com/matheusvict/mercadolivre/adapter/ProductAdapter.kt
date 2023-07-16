package com.matheusvict.mercadolivre.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.matheusvict.mercadolivre.databinding.ProductLayoutBinding
import com.matheusvict.mercadolivre.model.Product

class ProductAdapter(private val context: Context, val productList: MutableList<Product>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemList = ProductLayoutBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProductViewHolder(itemList)

    }

    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val productPosition = productList[position]
        holder.productImg.setImageResource(productPosition.img!!)
        holder.productPrice.text = productPosition.price
        holder.productDescription.text = productPosition.description
        holder.productFrete.text = productPosition.frete
    }

     inner class ProductViewHolder(binding: ProductLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        val productImg = binding.img
        val productPrice = binding.textPrice
        val productDescription = binding.textDescription
        val productFrete = binding.textFrete
    }
}