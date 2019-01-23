package com.example.sho.testmvp.screenone.contract

// ContractはViewとPresenterをつなぐためのもの
interface RegisterContract {
    interface View {
        fun showErrorMessage()
    }

    interface Presenter {
        fun clickRegisterButton()
    }
}