package com.example.a03enviardevolverinfo_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtFrase;
    private Button btnPC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicilizaVistas();

        btnPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = txtFrase.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("FRASE", txtFrase.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


    private void inicilizaVistas() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnPC = findViewById(R.id.btnPalabrasYCarac);
    }
}