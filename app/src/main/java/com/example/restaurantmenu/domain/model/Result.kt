package com.example.restaurantmenu.domain.model


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("is_display_image")
    val isDisplayImage: String = "",
    @SerializedName("menu_item_detail")
    val menuItemDetail: List<MenuItemDetail> = listOf(),
    @SerializedName("menu_name")
    val menuName: String = "",
    @SerializedName("restaurant_menu_id")
    val restaurantMenuId: Int = 0
)