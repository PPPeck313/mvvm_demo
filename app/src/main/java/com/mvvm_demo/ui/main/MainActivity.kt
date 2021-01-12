package com.mvvm_demo.ui.main

import com.mvvm_demo.R
import com.mvvm_demo.core.BaseActivity
import com.mvvm_demo.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {
    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel
    }

    override fun getLayoutRes() = R.layout.activity_main
}
