package com.mvvm_demo.di.component

import android.content.Context
import android.content.SharedPreferences
import com.mvvm_demo.App
import com.mvvm_demo.di.module.ApplicationModule
import com.mvvm_demo.di.module.DatabaseModule
import com.mvvm_demo.ui.main.MainActivityViewModel

import com.mvvm_demo.di.module.NetModule

import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class))


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)
}
