package com.ikaslea.asteroideak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Lokalizazioa extends AppCompatActivity {

    private Button bAcercaDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.main);


        bAcercaDe = findViewById(R.id.Button03);
        Button bIrten = findViewById(R.id.Button04);

        bIrten.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                finish();
            }
        });


        if (bAcercaDe != null) {
            bAcercaDe.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    lanzarAcercaDe(null);
                }
            });
        } else {

            throw new RuntimeException("Button03 ez da aurkitu");
        }

    }

    public void lanzarAcercaDe(View view) {
        Intent i = new Intent(this, AcercaDeActivity.class);
        startActivity(i);
    }

    public void irten(View view) {
        finish();
    }

}


