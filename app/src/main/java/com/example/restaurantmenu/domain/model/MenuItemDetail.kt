package com.example.restaurantmenu.domain.model


import com.google.gson.annotations.SerializedName

data class MenuItemDetail(
    @SerializedName("image")
    val image: String = "",
    @SerializedName("is_customization")
    val isCustomization: Int = 0,
    @SerializedName("is_featured")
    val isFeatured: String = "",
    @SerializedName("is_sold_out")
    val isSoldOut: String = "",
    @SerializedName("item_id")
    val itemId: String = "",
    @SerializedName("item_images")
    val itemImages: List<ItemImage> = listOf(),
    @SerializedName("item_name")
    val itemName: String = "",
    @SerializedName("item_type")
    val itemType: String = "",
    @SerializedName("mrp")
    val mrp: Int = 0,
    @SerializedName("price")
    val price: String = "0",
    @SerializedName("quantity")
    val quantity: Int = 0,
    @SerializedName("time_slot")
    val timeSlot: String = "",
    var menuItemView: MenuItemViews = MenuItemViews.TEXT
) {
    enum class MenuItemViews {
        IMAGE, TEXT
    }
}