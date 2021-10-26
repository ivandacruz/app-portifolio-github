package com.ivan.app_portifolio_github.domain

import com.ivan.app_portifolio_github.core.UseCase
import com.ivan.app_portifolio_github.data.model.Repo
import com.ivan.app_portifolio_github.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}
