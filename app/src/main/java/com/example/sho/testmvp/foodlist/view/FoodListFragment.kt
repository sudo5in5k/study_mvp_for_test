package com.example.sho.testmvp.foodlist.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.sho.testmvp.R
import com.example.sho.testmvp.foodlist.Presenter.FoodListPresenter
import com.example.sho.testmvp.foodlist.contract.FoodListContract
import kotlinx.android.synthetic.main.fragment_foodlist.*

class FoodListFragment : Fragment(), FoodListContract.View {

    private lateinit var presenter: FoodListContract.Presenter

    override fun showList(foodList: List<String>) {
        food_list.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_activated_1,
                foodList)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_foodlist, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter = FoodListPresenter(this)
        presenter.getFoodList()
    }

}