package com.example.restaurantmenu.util

import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.restaurantmenu.R

fun <T> ImageView.loadImage(uri: T) {
    Glide.with(this)
        .load(uri.toString())
        .placeholder(R.drawable.img_default_profile_picture)
        .error(R.drawable.img_default_profile_picture)
        .into(this)
}

fun View.toggle(isVisible: Boolean) {
    this.visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun String.rupeeSymbol(): String {
    return "₹$this"
}

fun <T> Fragment.toast(message: T){
    Toast.makeText(requireContext(), message.toString(), Toast.LENGTH_SHORT).show()
}