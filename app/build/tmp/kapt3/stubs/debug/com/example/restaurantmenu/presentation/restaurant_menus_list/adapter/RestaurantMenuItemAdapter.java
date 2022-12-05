package com.example.restaurantmenu.presentation.restaurant_menus_list.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listRestaurantMenus", "", "Lcom/example/restaurantmenu/domain/model/MenuItemDetail;", "onItemCLick", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "RestaurantMenuImageViewHolder", "RestaurantMenuViewHolder", "app_debug"})
public final class RestaurantMenuItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.List<com.example.restaurantmenu.domain.model.MenuItemDetail> listRestaurantMenus = null;
    private final kotlin.jvm.functions.Function1<com.example.restaurantmenu.domain.model.MenuItemDetail, kotlin.Unit> onItemCLick = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.restaurantmenu.presentation.restaurant_menus_list.adapter.RestaurantMenuItemAdapter.Companion Companion = null;
    private static final int MENU_ITEM_IMAGE = 1;
    private static final int MENU_ITEM_TEXT = 2;
    
    public RestaurantMenuItemAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.restaurantmenu.domain.model.MenuItemDetail> listRestaurantMenus, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.restaurantmenu.domain.model.MenuItemDetail, kotlin.Unit> onItemCLick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuItemAdapter$RestaurantMenuImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/restaurantmenu/databinding/ItemImageMenuBinding;", "(Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuItemAdapter;Lcom/example/restaurantmenu/databinding/ItemImageMenuBinding;)V", "bind", "", "menuItem", "Lcom/example/restaurantmenu/domain/model/MenuItemDetail;", "app_debug"})
    public final class RestaurantMenuImageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.restaurantmenu.databinding.ItemImageMenuBinding binding = null;
        
        public RestaurantMenuImageViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.restaurantmenu.databinding.ItemImageMenuBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.restaurantmenu.domain.model.MenuItemDetail menuItem) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuItemAdapter$RestaurantMenuViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/restaurantmenu/databinding/ItemTextMenuBinding;", "(Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuItemAdapter;Lcom/example/restaurantmenu/databinding/ItemTextMenuBinding;)V", "bind", "", "menuItem", "Lcom/example/restaurantmenu/domain/model/MenuItemDetail;", "app_debug"})
    public final class RestaurantMenuViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.restaurantmenu.databinding.ItemTextMenuBinding binding = null;
        
        public RestaurantMenuViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.restaurantmenu.databinding.ItemTextMenuBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.restaurantmenu.domain.model.MenuItemDetail menuItem) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/restaurantmenu/presentation/restaurant_menus_list/adapter/RestaurantMenuItemAdapter$Companion;", "", "()V", "MENU_ITEM_IMAGE", "", "MENU_ITEM_TEXT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}