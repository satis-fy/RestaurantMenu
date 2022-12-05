package com.example.restaurantmenu.domain.model

import com.google.gson.annotations.SerializedName

data class RequestData(
    @SerializedName("date")
    var date: String = "",
    @SerializedName("delivery_type_time_slots")
    var deliveryTypeTimeSlots: Int = -1,
    @SerializedName("is_langauge")
    var isLanguage: String = "E",
    @SerializedName("latitude")
    var latitude: Long = 0L,
    @SerializedName("longitude")
    var longitude: Long = 0L,
    @SerializedName("restaurant_id")
    var restaurantId: Int = 0,
    @SerializedName("starttime")
    var startTime: String = "",
    @SerializedName("vendor_id")
    var vendorId: Int = 0,
)
