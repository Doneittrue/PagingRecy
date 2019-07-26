package com.example.pagingrecy

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.example.pagingrecy.GitRepo
import com.example.pagingrecy.GitRepoDataSource

class GitRepoDataSourceFactory : DataSource.Factory<Int, GitRepo>() {

    val gitRepoLiveDataSource = MutableLiveData<GitRepoDataSource>()

    override fun create(): DataSource<Int, GitRepo> {
        val repoDataSource = GitRepoDataSource()
        gitRepoLiveDataSource.postValue(repoDataSource)
        return repoDataSource
    }
}