package com.example.oelalamielhassani.daggerexample.lobby

import android.util.Log
import dagger.multibindings.IntKey
import javax.inject.Inject

/**
 * Created by oelalamielhassani on 21/02/2018.
 */
class TestInjectedClass {
    val testDeux : TestDeux

    @Inject
    constructor(testDeux: TestDeux){
        this.testDeux = testDeux
        Log.d("Message" , "TestInjectionClass Créer")
    }
}