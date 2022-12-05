package com.example.restaurantmenu.presentation.restaurant_menus_list

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.ahmadhamwi.tabsync.TabbedListMediator
import com.example.restaurantmenu.R
import com.example.restaurantmenu.databinding.RestaurantMenusListFragmentBinding
import com.example.restaurantmenu.presentation.restaurant_menus_list.adapter.RestaurantMenuAdapter
import com.example.restaurantmenu.presentation.restaurant_menus_list.adapter.RestaurantMenuItemAdapter
import com.example.restaurantmenu.util.Resource
import com.example.restaurantmenu.util.toast
import com.example.restaurantmenu.util.toggle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlin.math.abs

@AndroidEntryPoint
class RestaurantMenusListFragment : Fragment() {

    private var _binding: RestaurantMenusListFragmentBinding? = null
    private val binding get() = _binding!!

    private val restaurantMenuViewModel: RestaurantMenusViewModel by viewModels()
    private val restaurantMenuAdapter = RestaurantMenuAdapter() { menuItemDetail ->
        toast("${menuItemDetail.itemName} Added")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RestaurantMenusListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            toolBarHandler()
            recyclerViewMenu.adapter = restaurantMenuAdapter
            observeRestaurantMenuList()
        }
    }

    private fun observeRestaurantMenuList() {
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            restaurantMenuViewModel.restaurantMenusList.collectLatest { event ->
                when (event) {
                    is Resource.Error -> {
                        event.message?.let { error ->
                            Snackbar.make(binding.root, error, Snackbar.LENGTH_SHORT).show()
                        }
                    }
                    is Resource.Loading -> {
                        binding.progressBar.toggle(event.isLoading)
                    }
                    is Resource.Success -> {
                        event.data?.result?.let { results ->
                            updateRecyclerView(results)
                        }
                    }
                }
            }
        }
    }

    private fun updateRecyclerView(list: List<com.example.restaurantmenu.domain.model.Result>) {
        binding.apply {
            restaurantMenuAdapter.addItems(list)
            list.forEach { mResult ->
                binding.tabLayout.addTab(tabLayout.newTab().setText(mResult.menuName))
            }

            TabbedListMediator(
                recyclerViewMenu,
                tabLayout,
                list.indices.toList(),
                true
            ).attach()
        }
    }

    private fun toolBarHandler() {
        binding.apply {
            toolBar.setNavigationOnClickListener {
                requireActivity().onBackPressedDispatcher.onBackPressed()
            }

            toolBar.menu[0].setOnMenuItemClickListener {
                toast(it.title)
                true
            }

            appBarLayout.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
                if (abs(verticalOffset) == appBarLayout.totalScrollRange) {
                    toolBar.menu[0].isVisible = true
                } else if (verticalOffset == 0) {
                    toolBar.menu[0].isVisible = false
                }
            }
        }
    }
}