package com.createsapp.navigationcomponenttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_second, container, false)

//        val number = args.number
//
//        view.secondText.text = number.toString()
//
//        view.secondText.setOnClickListener { Navigation.findNavController(view).navigate(R.id.navigateToFirstFragment) }

        return  view
    }


}