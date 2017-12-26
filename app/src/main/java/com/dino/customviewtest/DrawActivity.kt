package com.dino.customviewtest

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_draw.*

/**
 * Created by Dino on 2017/12/26.
 */
class DrawActivity : AppCompatActivity(){
    var modules : ArrayList<Module> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw)
        modules.add(Module(R.layout.drawcolor,"drawcolor"))
        modules.add(Module(R.layout.drawcircle,"drawcircle"))
        modules.add(Module(R.layout.drawrect,"drawrect"))
        modules.add(Module(R.layout.drawpoint,"drawpoint"))
        viewPager.adapter = object : FragmentPagerAdapter(supportFragmentManager){
            override fun getItem(position: Int): Fragment {
                return DrawFragment().newInstanse(modules[position].sampleLayoutRes)
            }
            override fun getCount(): Int = modules.size
            override fun getPageTitle(position: Int): CharSequence = modules[position].title
        }
        tabLayout.setupWithViewPager(viewPager)

    }

    class Module{
        @LayoutRes var sampleLayoutRes : Int;
        var title : String;

        constructor(sampleLayoutRes: Int, title: String) {
            this.sampleLayoutRes = sampleLayoutRes
            this.title = title
        }

    }
}