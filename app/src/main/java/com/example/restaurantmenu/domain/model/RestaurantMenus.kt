package com.example.restaurantmenu.domain.model


import com.google.gson.annotations.SerializedName

data class RestaurantMenus(
    @SerializedName("Bravges")
    val bravges: List<Any> = listOf(),
    @SerializedName("code")
    val code: Int = 0,
    @SerializedName("item_count")
    val itemCount: Int = 0,
    @SerializedName("msg")
    val msg: String = "",
    @SerializedName("restaurant_on_off")
    val restaurantOnOff: String = "",
    @SerializedName("Result")
    val result: List<Result> = listOf()
)