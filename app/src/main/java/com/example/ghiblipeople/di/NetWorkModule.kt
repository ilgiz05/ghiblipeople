package com.example.ghiblipeople.di

import com.example.ghiblipeople.data.remote.NetWorkClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetWorkModule {

    @Singleton
    @Provides
    fun providePeopleApiService(netWorkClient: NetWorkClient) =
        netWorkClient.providePeopleApiService()
}