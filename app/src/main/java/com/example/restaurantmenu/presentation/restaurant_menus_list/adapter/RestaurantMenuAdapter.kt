package com.example.restaurantmenu.presentation.restaurant_menus_list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantmenu.databinding.ItemMenuBinding
import com.example.restaurantmenu.domain.model.MenuItemDetail

class RestaurantMenuAdapter(private val onItemClick: (MenuItemDetail) -> Unit) :
    RecyclerView.Adapter<RestaurantMenuAdapter.RestaurantMenuViewHolder>() {

    private val listRestaurantMenus =
        mutableListOf<com.example.restaurantmenu.domain.model.Result>()

    inner class RestaurantMenuViewHolder(private val binding: ItemMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(result: com.example.restaurantmenu.domain.model.Result) {
            binding.apply {
                textViewMenuName.text = result.menuName
                recyclerViewMenuItem.adapter =
                    RestaurantMenuItemAdapter(result.menuItemDetail) { menuItemDetail ->
                        onItemClick.invoke(menuItemDetail)
                    }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantMenuViewHolder {
        val binding = ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RestaurantMenuViewHolder(binding)
    }

    override fun getItemCount() = listRestaurantMenus.size

    fun addItems(list: List<com.example.restaurantmenu.domain.model.Result>) {
        listRestaurantMenus.clear()
        listRestaurantMenus.addAll(list)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: RestaurantMenuViewHolder, position: Int) {
        holder.bind(listRestaurantMenus[position])
    }
}