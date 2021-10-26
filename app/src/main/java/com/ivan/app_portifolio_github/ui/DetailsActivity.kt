package com.ivan.app_portifolio_github.ui

import android.app.Application
import com.ivan.app_portifolio_github.data.di.DataModule
import com.ivan.app_portifolio_github.data.di.DomainModule
import com.ivan.app_portifolio_github.data.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }

}