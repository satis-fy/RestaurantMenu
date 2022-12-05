package com.example.restaurantmenu.domain.model


import com.google.gson.annotations.SerializedName

data class ItemImage(
    @SerializedName("image_name")
    val imageName: String = ""
)