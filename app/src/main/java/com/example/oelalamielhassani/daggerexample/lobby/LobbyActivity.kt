package com.example.oelalamielhassani.daggerexample.lobby

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.oelalamielhassani.daggerexample.R
import com.example.oelalamielhassani.daggerexample.common.CommonHelloService
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.HasFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import dagger.android.DispatchingAndroidInjector



class LobbyActivity : AppCompatActivity(),HasFragmentInjector {
    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun fragmentInjector(): AndroidInjector<Fragment> =fragmentDispatchingAndroidInjector

    @Inject
    lateinit var commonHelloService : CommonHelloService

    @Inject
    lateinit var lobbyHelloService: LobbyHelloService



    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.setOnClickListener(View.OnClickListener {
            //text.text = lobbyHelloService.sayHello()
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
