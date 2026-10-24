package com.example.tty9;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class prilojenieAdapter extends RecyclerView.Adapter<applicationViewholder> {

    private ArrayList<String> application;
    @NonNull
    @Override
    public applicationViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new applicationViewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prilojenie,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull applicationViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return application.size();
    }
}
