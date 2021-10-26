package com.ivan.app_portifolio_github.data.di

import com.ivan.app_portifolio_github.domain.ListUserRepositoriesUseCase
import com.ivan.app_portifolio_github.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {

    fun load() {
        loadKoinModules(viewModelModule())
    }

    private fun viewModelModule() : Module {
        return module {
            viewModel {
                MainViewModel(get())
            }
        }

    }
}