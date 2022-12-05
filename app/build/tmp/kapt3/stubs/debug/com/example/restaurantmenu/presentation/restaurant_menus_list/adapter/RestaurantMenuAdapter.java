package com.example.restaurantmenu.presentation.restaurant_menus_list.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuAdapter$RestaurantMenuViewHolder;", "onItemClick", "Lkotlin/Function1;", "Lcom/example/restaurantmenu/domain/model/MenuItemDetail;", "", "(Lkotlin/jvm/functions/Function1;)V", "listRestaurantMenus", "", "Lcom/example/restaurantmenu/domain/model/Result;", "addItems", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RestaurantMenuViewHolder", "app_debug"})
public final class RestaurantMenuAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.restaurantmenu.presentation.restaurant_menus_list.adapter.RestaurantMenuAdapter.RestaurantMenuViewHolder> {
    private final kotlin.jvm.functions.Function1<com.example.restaurantmenu.domain.model.MenuItemDetail, kotlin.Unit> onItemClick = null;
    private final java.util.List<com.example.restaurantmenu.domain.model.Result> listRestaurantMenus = null;
    
    public RestaurantMenuAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.restaurantmenu.domain.model.MenuItemDetail, kotlin.Unit> onItemClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.restaurantmenu.presentation.restaurant_menus_list.adapter.RestaurantMenuAdapter.RestaurantMenuViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.restaurantmenu.domain.model.Result> list) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.restaurantmenu.presentation.restaurant_menus_list.adapter.RestaurantMenuAdapter.RestaurantMenuViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuAdapter$RestaurantMenuViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/restaurantmenu/databinding/ItemMenuBinding;", "(Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuAdapter;Lcom/example/restaurantmenu/databinding/ItemMenuBinding;)V", "bind", "", "result", "Lcom/example/restaurantmenu/domain/model/Result;", "app_debug"})
    public final class RestaurantMenuViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.restaurantmenu.databinding.ItemMenuBinding binding = null;
        
        public RestaurantMenuViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.restaurantmenu.databinding.ItemMenuBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.restaurantmenu.domain.model.Result result) {
        }
    }
}