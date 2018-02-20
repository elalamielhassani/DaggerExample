package com.example.oelalamielhassani.daggerexample.di

import com.example.oelalamielhassani.daggerexample.lobby.LobbyActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.oelalamielhassani.daggerexample.lobby.LobbyActivityModule
import com.example.oelalamielhassani.daggerexample.lobby.LobbyFragment
import com.example.oelalamielhassani.daggerexample.lobby.LobbyFragmentModule


/**
 * Created by oelalamielhassani on 20/02/2018.
 */
@Module
abstract class BuildersModule {
    @ContributesAndroidInjector(modules = [LobbyActivityModule::class])
    abstract fun bindLobbyActivity() : LobbyActivity

    @ContributesAndroidInjector(modules = [LobbyFragmentModule::class])
    abstract fun bindLobbyFragment() : LobbyFragment
}