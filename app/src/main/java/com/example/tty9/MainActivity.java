package com.example.tty9;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView ty_pri;
    private ArrayList<String> listPrilo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ty_pri = findViewById(R.id.prilojenie);

        prilo();


        prilojenieAdapter prilojenieAdapter = new prilojenieAdapter();
        ty_pri.setAdapter(prilojenieAdapter);

    }

    private void prilo() {
        listPrilo.add("FaceBook");
        listPrilo.add("Instagram");
        listPrilo.add("Tiktok");
        listPrilo.add("Tyndyk");
        listPrilo.add("Figma");
        listPrilo.add("Android Studio");
        listPrilo.add("FaceBook");
        listPrilo.add("FaceBook");
        listPrilo.add("FaceBook");
        listPrilo.add("FaceBook");
        listPrilo.add("FaceBook");
        listPrilo.add("FaceBook");
        listPrilo.add("FaceBook");
        listPrilo.add("FaceBook");
        listPrilo.add("FaceBook");
    }
}