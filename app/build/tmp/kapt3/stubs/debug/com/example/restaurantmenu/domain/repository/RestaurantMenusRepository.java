package com.example.restaurantmenu.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/restaurantmenu/domain/repository/RestaurantMenusRepository;", "", "getRestaurantMenusList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/restaurantmenu/util/Resource;", "Lcom/example/restaurantmenu/domain/model/RestaurantMenus;", "requestData", "Lcom/example/restaurantmenu/domain/model/RequestData;", "(Lcom/example/restaurantmenu/domain/model/RequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RestaurantMenusRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRestaurantMenusList(@org.jetbrains.annotations.NotNull()
    com.example.restaurantmenu.domain.model.RequestData requestData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.restaurantmenu.util.Resource<com.example.restaurantmenu.domain.model.RestaurantMenus>>> continuation);
}