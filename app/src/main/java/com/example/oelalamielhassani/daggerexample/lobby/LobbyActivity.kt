package com.example.oelalamielhassani.daggerexample.lobby

import android.app.Fragment
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.oelalamielhassani.daggerexample.R
import com.example.oelalamielhassani.daggerexample.common.CommonHelloService
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector


class LobbyActivity : AppCompatActivity(), LobbyFragment.OnFragmentInteractionListener , HasSupportFragmentInjector {
    override fun supportFragmentInjector(): AndroidInjector<android.support.v4.app.Fragment>?  = fragmentDispatchingAndroidInjector

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<android.support.v4.app.Fragment>

    @Inject
    lateinit var commonHelloService : CommonHelloService

    @Inject
    lateinit var lobbyHelloService: LobbyHelloService





    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        text.setOnClickListener(View.OnClickListener {
                when (text.text){
                    commonHelloService.sayHello() -> text.text = lobbyHelloService.sayHello()
                    lobbyHelloService.sayHello() -> text.text = commonHelloService.sayHello()
                }
            }
        )
    }

    override fun onResume() {
        super.onResume()
        sayCommonHello()
    }

    private fun sayCommonHello(){
        text.text = commonHelloService.sayHello()
    }

}
