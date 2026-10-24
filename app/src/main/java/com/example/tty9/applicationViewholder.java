package com.example.tty9;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class applicationViewholder extends RecyclerView.ViewHolder {

    private TextView prilo;
    public applicationViewholder(@NonNull View itemView) {
        super(itemView);
        prilo=itemView.findViewById(R.id.prilo);
    }
    public void bind(String application){
        prilo.setText(application);

    }
}
