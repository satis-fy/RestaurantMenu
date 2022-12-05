package com.example.restaurantmenu.presentation.restaurant_menus_list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantmenu.databinding.ItemImageMenuBinding
import com.example.restaurantmenu.databinding.ItemTextMenuBinding
import com.example.restaurantmenu.domain.model.MenuItemDetail
import com.example.restaurantmenu.util.loadImage
import com.example.restaurantmenu.util.rupeeSymbol

class RestaurantMenuItemAdapter(
    private val listRestaurantMenus: List<MenuItemDetail>,
    private val onItemCLick: (MenuItemDetail) -> Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val MENU_ITEM_IMAGE = 1
        private const val MENU_ITEM_TEXT = 2
    }

    inner class RestaurantMenuImageViewHolder(private val binding: ItemImageMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(menuItem: MenuItemDetail) {
            binding.apply {
                imageViewMenuItem.loadImage(menuItem.image)
                textViewName.text = menuItem.itemName
                textViewDescription.text = menuItem.itemId
                textViewPrice.text = menuItem.price.rupeeSymbol()

                buttonAdd.setOnClickListener {
                    onItemCLick.invoke(listRestaurantMenus[adapterPosition])
                }
            }
        }
    }

    inner class RestaurantMenuViewHolder(private val binding: ItemTextMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(menuItem: MenuItemDetail) {
            binding.apply {
                textViewName.text = menuItem.itemName
                textViewDescription.text = menuItem.itemType
                textViewPrice.text = menuItem.price.rupeeSymbol()

                buttonAdd.setOnClickListener {
                    onItemCLick.invoke(listRestaurantMenus[adapterPosition])
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            MENU_ITEM_IMAGE -> {
                val binding =
                    ItemImageMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                RestaurantMenuImageViewHolder(binding)
            }
            else -> {
                val binding =
                    ItemTextMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                RestaurantMenuViewHolder(binding)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (listRestaurantMenus[position].menuItemView) {
            MenuItemDetail.MenuItemViews.IMAGE -> (holder as RestaurantMenuImageViewHolder).bind(
                listRestaurantMenus[position]
            )
            MenuItemDetail.MenuItemViews.TEXT -> (holder as RestaurantMenuViewHolder).bind(
                listRestaurantMenus[position]
            )
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (listRestaurantMenus[position].menuItemView) {
            MenuItemDetail.MenuItemViews.IMAGE -> MENU_ITEM_IMAGE
            MenuItemDetail.MenuItemViews.TEXT -> MENU_ITEM_TEXT
        }
    }

    override fun getItemCount() = listRestaurantMenus.size
}