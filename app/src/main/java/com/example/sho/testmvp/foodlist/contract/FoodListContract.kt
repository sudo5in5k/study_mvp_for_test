package com.example.sho.testmvp.foodlist.contract

interface FoodListContract {
    interface Presenter {
        fun getFoodList()
    }

    interface View {
        fun showList(foodList: List<String>)
    }
}