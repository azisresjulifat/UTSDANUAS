package com.example.myapplication.tabs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.myapplication.MapsActivity
import com.example.myapplication.R

class MapsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_maps, container, false)
        val btnMaps: Button = view.findViewById(R.id.btnMaps)

        btnMaps.setOnClickListener(){
            val intent = Intent(view.context, MapsActivity::class.java)
            startActivity(intent)
        }
        return view
    }
}