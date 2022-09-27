package com.example.a03enviardevolverinfo_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView txtFrase;
    private TextView txtNumeroCarac;
    private TextView txtNumeroPal;
    private String frase;
    private String[] palabras;
    private String[] caracteeres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        inicializaVistas();

        Intent intent =  getIntent();
        Bundle bundle = intent.getExtras();

        frase = bundle.getString("FRASE");
        txtFrase.setText(frase);


        palabras = frase.split("");
        
    }

    private void inicializaVistas() {
        txtFrase = findViewById(R.id.txtFraseCarac);
        txtNumeroPal = findViewById(R.id.txtNumPal);
        txtNumeroCarac = findViewById(R.id.txtNumCarac);
    }
}