package com.example.oelalamielhassani.daggerexample

import android.app.Activity
import android.app.Application
import com.example.oelalamielhassani.daggerexample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * Created by oelalamielhassani on 20/02/2018.
 */
class App : Application() , HasActivityInjector {


    @Inject
    lateinit var dispatchingAndroidInjector : DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
                .builder().
                application(this).
                build().
                inject(this)

    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

}