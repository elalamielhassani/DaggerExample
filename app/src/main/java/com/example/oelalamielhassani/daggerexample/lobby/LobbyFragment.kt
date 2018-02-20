package com.example.oelalamielhassani.daggerexample.lobby

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.oelalamielhassani.daggerexample.R
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_lobby.*
import javax.inject.Inject

class LobbyFragment : Fragment() {

    @Inject
    lateinit var lobbyFragmentHelloService: LobbyFragmentHelloService



    private var mListener: OnFragmentInteractionListener? = null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_lobby, container, false)
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sayFragmentHello()
    }


    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    interface OnFragmentInteractionListener {
    }

    companion object {
        fun newInstance(): LobbyFragment = LobbyFragment()
    }

    private fun sayFragmentHello() {
        text2.text=lobbyFragmentHelloService.sayHello()
    }
}
