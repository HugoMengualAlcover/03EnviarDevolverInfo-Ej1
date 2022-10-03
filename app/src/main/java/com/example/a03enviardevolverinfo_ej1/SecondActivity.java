package com.example.a03enviardevolverinfo_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.StringTokenizer;

public class SecondActivity extends AppCompatActivity {
    private TextView txtFrase;
    private TextView txtNumero;
    private String frase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        inicializaVistas();
        contarCosas();
    }

    private void inicializaVistas() {
        txtFrase = findViewById(R.id.txtFraseCarac);
        txtNumero = findViewById(R.id.txtNum);
    }

    private void contarCosas(){
        Intent intent =  getIntent();
        Bundle bundle = intent.getExtras();


        if(bundle != null)
        {
            frase = bundle.getString("FRASE");
            txtFrase.setText(frase);
            int operacion = bundle.getInt("OPERACION");

            if(operacion==R.id.btnPalabras){
                StringTokenizer stringTokenizer = new StringTokenizer(frase);
                txtNumero.setText(String.valueOf(stringTokenizer.countTokens()));

            }
            else if(operacion==R.id.btnCaracteres){
                txtNumero.setText(String.valueOf(frase.length()));
            }else{
                txtNumero.setText("ERROR");
            }
        }
    }
}