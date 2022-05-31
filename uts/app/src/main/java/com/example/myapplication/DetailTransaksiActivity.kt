package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailTransaksiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_transaksi)
        title = "Detail"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}