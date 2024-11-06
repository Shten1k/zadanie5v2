package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int licznik = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button polub = findViewById(R.id.polub);
        Button usun = findViewById(R.id.usun);
        TextView  textliczba = findViewById(R.id.liczba);

        polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik = licznik + 1;
                textliczba.setText(String.valueOf(licznik) + " polubień");
            }

        });

        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (licznik > 0) {
                    licznik = licznik - 1;
                    textliczba.setText(String.valueOf(licznik) + " polubień");

                }
            }

        });
    }
}