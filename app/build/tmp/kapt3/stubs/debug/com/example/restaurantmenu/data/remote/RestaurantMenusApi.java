package com.example.restaurantmenu.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/restaurantmenu/data/remote/RestaurantMenusApi;", "", "getRestaurantMenuList", "Lretrofit2/Response;", "Lcom/example/restaurantmenu/domain/model/RestaurantMenus;", "requestData", "Lcom/example/restaurantmenu/domain/model/RequestData;", "(Lcom/example/restaurantmenu/domain/model/RequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RestaurantMenusApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "restaurantmenus")
    public abstract java.lang.Object getRestaurantMenuList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.restaurantmenu.domain.model.RequestData requestData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.restaurantmenu.domain.model.RestaurantMenus>> continuation);
}