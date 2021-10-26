package com.ivan.app_portifolio_github.data.repositories

import com.ivan.app_portifolio_github.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}
