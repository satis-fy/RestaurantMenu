package com.example.restaurantmenu.domain.repository

import com.example.restaurantmenu.domain.model.RequestData
import com.example.restaurantmenu.domain.model.RestaurantMenus
import com.example.restaurantmenu.util.Resource
import kotlinx.coroutines.flow.Flow

interface RestaurantMenusRepository {
    suspend fun getRestaurantMenusList(requestData: RequestData): Flow<Resource<RestaurantMenus>>
}