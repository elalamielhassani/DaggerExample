package com.example.oelalamielhassani.daggerexample.di

import android.content.Context
import com.example.oelalamielhassani.daggerexample.App
import com.example.oelalamielhassani.daggerexample.common.CommonHelloService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by oelalamielhassani on 20/02/2018.
 */
@Module
class AppModule {

    @Provides
    fun provideContext(application : App) : Context = application.applicationContext

    @Singleton
    @Provides
    fun provideCommonHelloService() : CommonHelloService = CommonHelloService()

}