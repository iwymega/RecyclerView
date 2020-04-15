package com.megantara.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    // implementasi untuk kontruktor
    private Context context;
    private String[] android;

    // konstruktor untuk RecyclerViewAdapter
    public RecyclerViewAdapter(Context context, String[] android) {
        this.context = context;
        this.android = android;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // membuat layout inflater
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // menggati textview berupa data set pada "String[] android"
        holder.text_android.setText(android[position]);
    }

    @Override
    public int getItemCount() {
        // mengembalikan ukuran data set
        return android.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // implementasi textview
        private AppCompatTextView text_android;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // deklarasi textview
            text_android = itemView.findViewById(R.id.text_android);

            // ketika salah satu item di klik maka akan menampilkan toast
            // yang berisi text yang kamu pilih
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // untuk mendapatkan posisi di adapter
                    int position = getAdapterPosition();
                    // menampilkan toast
                    Toast.makeText(context, android[position], Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
