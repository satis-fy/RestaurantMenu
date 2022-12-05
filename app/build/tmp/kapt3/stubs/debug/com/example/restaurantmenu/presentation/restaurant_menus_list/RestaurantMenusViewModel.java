package com.example.restaurantmenu.presentation.restaurant_menus_list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/restaurantmenu/presentation/restaurant_menus_list/RestaurantMenusViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/restaurantmenu/domain/repository/RestaurantMenusRepository;", "(Lcom/example/restaurantmenu/domain/repository/RestaurantMenusRepository;)V", "_restaurantMenusList", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/restaurantmenu/util/Resource;", "Lcom/example/restaurantmenu/domain/model/RestaurantMenus;", "restaurantMenusList", "Lkotlinx/coroutines/flow/SharedFlow;", "getRestaurantMenusList", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/Job;", "requestData", "Lcom/example/restaurantmenu/domain/model/RequestData;", "app_debug"})
public final class RestaurantMenusViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.restaurantmenu.domain.repository.RestaurantMenusRepository repository = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.restaurantmenu.util.Resource<com.example.restaurantmenu.domain.model.RestaurantMenus>> _restaurantMenusList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.example.restaurantmenu.util.Resource<com.example.restaurantmenu.domain.model.RestaurantMenus>> restaurantMenusList = null;
    
    @javax.inject.Inject()
    public RestaurantMenusViewModel(@org.jetbrains.annotations.NotNull()
    com.example.restaurantmenu.domain.repository.RestaurantMenusRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.example.restaurantmenu.util.Resource<com.example.restaurantmenu.domain.model.RestaurantMenus>> getRestaurantMenusList() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getRestaurantMenusList(com.example.restaurantmenu.domain.model.RequestData requestData) {
        return null;
    }
}