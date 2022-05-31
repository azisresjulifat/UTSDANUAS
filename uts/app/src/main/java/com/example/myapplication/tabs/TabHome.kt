package com.example.myapplication.tabs

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.Transaksi
import com.example.pertemuan5.ListJenisTransaksiAdapter
import com.example.myapplication.DetailTransaksiActivity
import kotlinx.android.synthetic.main.item_transaksi.*

class TabHome : Fragment() {
    private lateinit var rvTransaksi: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_tab_home, container, false)
        rvTransaksi = view.findViewById(R.id.list_transaksi)

        var itemsJenisTransaksi: ArrayList<Transaksi> = arrayListOf<Transaksi>(
            Transaksi(image = R.drawable.laptop, jenisTransaksi = "Laptop", namaTransaksi = "Laptop Acer", harga = "8500000"),
            Transaksi(image = R.drawable.printer, jenisTransaksi = "Printer", namaTransaksi = "HP Deskjet 2776", harga = "900000"),
            Transaksi(image = R.drawable.mouse, jenisTransaksi = "Mouse", namaTransaksi = "Logitech", harga = "350000")

        )

        rvTransaksi.setHasFixedSize(true)
        rvTransaksi.layoutManager = LinearLayoutManager( view.context)
        val listBuahAdapter = ListJenisTransaksiAdapter(itemsJenisTransaksi)
        rvTransaksi.adapter = listBuahAdapter

        listBuahAdapter.setOnItemClickCallback(object: ListJenisTransaksiAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Transaksi, index: Int) {
                val detailIntent = Intent(view.context, DetailTransaksiActivity::class.java)
                detailIntent.putExtra("jenis_transaksi", itemsJenisTransaksi[index].jenisTransaksi)
                detailIntent.putExtra("nama_transaksi", itemsJenisTransaksi[index].namaTransaksi)
                detailIntent.putExtra("harga", itemsJenisTransaksi[index].harga)
                detailIntent.putExtra("image", itemsJenisTransaksi[index].image)
                startActivity(detailIntent)
            }
        } )

        return view
    }
}