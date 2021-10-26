package com.ivan.app_portifolio_github.data.di

import com.ivan.app_portifolio_github.domain.ListUserRepositoriesUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListUserRepositoriesUseCase(get()) }
        }
    }

}