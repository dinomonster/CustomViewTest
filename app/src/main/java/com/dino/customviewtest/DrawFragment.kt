package com.dino.customviewtest

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Dino on 2017/12/26.
 */
class DrawFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(arguments.getInt("layout"),container,false)
    }

    fun newInstanse(@LayoutRes sampleLayoutRes : Int) : DrawFragment{
        var fragment = DrawFragment()
        var bundle = Bundle();
        bundle.putInt("layout",sampleLayoutRes)
        fragment.arguments = bundle
        return fragment
    }
}