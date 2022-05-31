package com.example.myapplication.tabs

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import android.widget.Button
import com.example.myapplication.FormActivity

/**
 * A simple [Fragment] subclass.
 * Use the [TabTransaksi.newInstance] factory method to
 * create an instance of this fragment.
 */
class TabTransaksi : Fragment() {
    private lateinit var btnTambah: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_tab_transaksi, container, false)
        btnTambah = view.findViewById(R.id.btnTambah)
        btnTambah.setOnClickListener {
            val formIntent = Intent(view.context, FormActivity::class.java)
            startActivity(formIntent)
        }

        return view
    }
}