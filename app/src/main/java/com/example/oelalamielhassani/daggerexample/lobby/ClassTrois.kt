package com.example.oelalamielhassani.daggerexample.lobby

import javax.inject.Inject

/**
 * Created by oelalamielhassani on 21/02/2018.
 */
class ClassTrois {
    val classQuatre : ClassQuatre
    @Inject
    constructor(classQuatre: ClassQuatre){
        this.classQuatre = classQuatre
    }
}