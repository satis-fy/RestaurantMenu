package com.example.restaurantmenu.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/restaurantmenu/data/repository/RestaurantMenusRepositoryImpl;", "Lcom/example/restaurantmenu/domain/repository/RestaurantMenusRepository;", "restaurantMenusApi", "Lcom/example/restaurantmenu/data/remote/RestaurantMenusApi;", "(Lcom/example/restaurantmenu/data/remote/RestaurantMenusApi;)V", "getRestaurantMenusList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/restaurantmenu/util/Resource;", "Lcom/example/restaurantmenu/domain/model/RestaurantMenus;", "requestData", "Lcom/example/restaurantmenu/domain/model/RequestData;", "(Lcom/example/restaurantmenu/domain/model/RequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RestaurantMenusRepositoryImpl implements com.example.restaurantmenu.domain.repository.RestaurantMenusRepository {
    private final com.example.restaurantmenu.data.remote.RestaurantMenusApi restaurantMenusApi = null;
    
    public RestaurantMenusRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.restaurantmenu.data.remote.RestaurantMenusApi restaurantMenusApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRestaurantMenusList(@org.jetbrains.annotations.NotNull()
    com.example.restaurantmenu.domain.model.RequestData requestData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.restaurantmenu.util.Resource<com.example.restaurantmenu.domain.model.RestaurantMenus>>> continuation) {
        return null;
    }
}