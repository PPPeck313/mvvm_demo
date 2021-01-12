package com.mvvm_demo

import com.mvvm_demo.di.component.DaggerApplicationComponent
import com.mvvm_demo.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

