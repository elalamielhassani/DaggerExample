package com.example.oelalamielhassani.daggerexample.di

import com.example.oelalamielhassani.daggerexample.App
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by oelalami
 * elhassani on 20/02/2018.
 */
@Singleton
@Component(modules = [
    AppModule::class,
    AndroidInjectionModule::class,
    BuildersModule::class
])
interface AppComponent{
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application : App) : Builder
        fun build() : AppComponent
    }
    fun inject(application : App)
}