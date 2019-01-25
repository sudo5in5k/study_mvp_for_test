package com.example.sho.testmvp.foodlist.Presenter

import com.example.sho.testmvp.foodlist.contract.FoodListContract
import com.example.sho.testmvp.model.entity.FoodEntity

class FoodListPresenter(private val view: FoodListContract.View): FoodListContract.Presenter {

    override fun getFoodList() {
        view.showList(FoodEntity.data())
    }

}