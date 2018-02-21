package com.example.oelalamielhassani.daggerexample.lobby

import javax.inject.Inject

/**
 * Created by oelalamielhassani on 20/02/2018.
 */
class LobbyFragmentHelloService {

    val testInjectedClass: TestInjectedClass
    @Inject
    constructor(testInjectedClass: TestInjectedClass){
        this.testInjectedClass=testInjectedClass
    }
    fun sayHello() : String = "Hello from LobbyFragmentHelloService"

}