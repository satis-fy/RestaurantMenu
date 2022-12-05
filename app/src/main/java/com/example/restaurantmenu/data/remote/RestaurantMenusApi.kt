package com.example.restaurantmenu.data.remote

import com.example.restaurantmenu.domain.model.RequestData
import com.example.restaurantmenu.domain.model.RestaurantMenus
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RestaurantMenusApi {

    @POST("restaurantmenus")
    suspend fun getRestaurantMenuList(@Body requestData: RequestData): Response<RestaurantMenus>

}