package com.example.oelalamielhassani.daggerexample.lobby

import dagger.Module
import dagger.Provides

/**
 * Created by oelalamielhassani on 20/02/2018.
 */
@Module
class LobbyActivityModule {
    @Provides
    fun provideLobbyHelloService() : LobbyHelloService = LobbyHelloService()

}