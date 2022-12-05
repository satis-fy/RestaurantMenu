package com.example.restaurantmenu.di

import com.example.restaurantmenu.data.remote.RestaurantMenusApi
import com.example.restaurantmenu.data.repository.RestaurantMenusRepositoryImpl
import com.example.restaurantmenu.domain.repository.RestaurantMenusRepository
import com.example.restaurantmenu.util.Constraint
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRestaurantMenuApi(): RestaurantMenusApi {
        return Retrofit.Builder()
            .baseUrl(Constraint.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }

    @Singleton
    @Provides
    fun provideRestaurantMenusRepository(restaurantMenusApi: RestaurantMenusApi): RestaurantMenusRepository {
        return RestaurantMenusRepositoryImpl(restaurantMenusApi)
    }
}