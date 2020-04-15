package com.megantara.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    // data berupa array string
    private String[] android = {
            "DKI Jakarta 2.335",
            "Jawa Barat 530",
            "Jawa Timur 475",
            "Banten 280",
            "Jawa Tengah 278",
            "Sulawesi Selatan 231",
            "Bali 92",
            "Sumatera Utara 72",
            "Papua 68",
            "DIY 62",
            "Sumatera Barat 48",
            "NTB 37",
            "Kalimantan Selatan 37",
            "Kalimantan Timur 35",
            "Kepulauan Riau 26",
            "Kalimantan Tengah 25",
            "Lampung 21",
            "Riau 20",
            "Sumatera Selatan 19",
            "Sulawesi Tengah 19",
            "Sulawesi Utara 17",
            "Kalimantan Utara 16"
    };

    // implementasi
    private RecyclerViewAdapter adapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // deklarasi untuk recyclerview
        recyclerView = findViewById(R.id.recyclerview);

        adapter = new RecyclerViewAdapter(this, android); // konstruktor untuk adapter
        linearLayoutManager = new LinearLayoutManager(this); // menampilkan item berupa list

        recyclerView.setLayoutManager(linearLayoutManager); // menset layoutmanager yg telah kita buat
        recyclerView.setAdapter(adapter); // menset adapter-nya
    }
}
