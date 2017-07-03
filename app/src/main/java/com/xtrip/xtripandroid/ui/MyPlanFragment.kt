package com.xtrip.xtripandroid.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.xtrip.xtripandroid.R

/**
 * A simple [Fragment] subclass.
 */
class MyPlanFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_my_plan, container, false)
    }
}// Required empty public constructor
