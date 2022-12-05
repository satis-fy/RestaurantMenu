package com.example.restaurantmenu.data.repository

import com.example.restaurantmenu.data.remote.RestaurantMenusApi
import com.example.restaurantmenu.domain.model.MenuItemDetail
import com.example.restaurantmenu.domain.model.RequestData
import com.example.restaurantmenu.domain.model.RestaurantMenus
import com.example.restaurantmenu.domain.repository.RestaurantMenusRepository
import com.example.restaurantmenu.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RestaurantMenusRepositoryImpl constructor(
    private val restaurantMenusApi: RestaurantMenusApi
) : RestaurantMenusRepository {
    override suspend fun getRestaurantMenusList(requestData: RequestData): Flow<Resource<RestaurantMenus>> {
        return flow {
            emit(Resource.Loading(true))

            try {
                val response = restaurantMenusApi.getRestaurantMenuList(requestData)
                if (response.isSuccessful) {
                    emit(Resource.Loading(false))

                    response.body()?.result?.let { results ->
                        results.forEach { mResult ->
                            mResult.menuItemDetail.forEach { menuItemDetail ->
                                menuItemDetail.menuItemView = if (mResult.isDisplayImage == "1") {
                                    MenuItemDetail.MenuItemViews.IMAGE
                                } else {
                                    MenuItemDetail.MenuItemViews.TEXT
                                }
                            }
                        }
                    }

                    emit(Resource.Success(response.body()))
                } else {
                    emit(Resource.Loading(false))
                    emit(Resource.Error(response.message()))
                }
            } catch (e: Exception) {
                emit(Resource.Loading(false))
                emit(Resource.Error(e.message ?: "Couldn't load data"))
            }
        }
    }
}