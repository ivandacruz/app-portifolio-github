package com.ivan.app_portifolio_github.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.security.acl.Owner

@Parcelize
data class Repo(
    val id: Long,
    val name: String,
    val owner: Owner,
    @SerializedName("stargazers_count")
    val stargazersCount: Long,
    val language: String?,
    @SerializedName("html_url")
    val htmlURL: String,
    val description: String?,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("forks_count")
    val forksCount: String,
    val watchers: String
): Parcelable

