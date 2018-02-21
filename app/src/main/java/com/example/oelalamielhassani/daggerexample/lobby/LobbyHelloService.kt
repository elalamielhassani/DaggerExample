package com.example.oelalamielhassani.daggerexample.lobby

import javax.inject.Inject

/**
 * Created by oelalamielhassani on 20/02/2018.
 */
class LobbyHelloService {
    val classTrois : ClassTrois
    @Inject
    constructor(classTrois: ClassTrois){
        this.classTrois = classTrois
    }
    fun sayHello() : String = "Hello from LobbyHelloService"
}