package com.example.restaurantmenu.presentation.restaurant_menus_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantmenu.domain.model.RequestData
import com.example.restaurantmenu.domain.model.RestaurantMenus
import com.example.restaurantmenu.domain.repository.RestaurantMenusRepository
import com.example.restaurantmenu.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RestaurantMenusViewModel @Inject constructor(
    private val repository: RestaurantMenusRepository
) : ViewModel() {

    private val _restaurantMenusList = MutableSharedFlow<Resource<RestaurantMenus>>()
    val restaurantMenusList = _restaurantMenusList.asSharedFlow()

    init {
        getRestaurantMenusList()
    }

    private fun getRestaurantMenusList(requestData: RequestData = RequestData()) = viewModelScope.launch {

        requestData.apply {
            latitude = 23.04565431097748.toLong()
            longitude = 72.51181852072477.toLong()
            restaurantId = 1334
            vendorId = 40820
        }

        repository.getRestaurantMenusList(requestData).collect { result ->
            when (result) {
                is Resource.Error -> {
                    result.message?.let { error ->
                        _restaurantMenusList.emit(Resource.Error(error))
                    }
                }
                is Resource.Loading -> {
                    _restaurantMenusList.emit(Resource.Loading(result.isLoading))
                }
                is Resource.Success -> {
                    _restaurantMenusList.emit(Resource.Success(result.data))
                }
            }
        }
    }

}