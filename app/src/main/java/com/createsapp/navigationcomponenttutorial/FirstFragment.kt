package com.createsapp.navigationcomponenttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

//        view.firstText.setOnClickListener {
//
//            val action = FirstFragmentDirections.navigateToSecondFragment(220)
//            Navigation.findNavController(view).navigate(action)
//        }
//slkdjskdfjslkdfjsdkl
        return view
    }


}