package com.example.a03enviardevolverinfo_ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtFrase;
    private Button btnPalab;
    private Button btnCarac;

    public static final int PALABRAS = 1;
    public static final int CARACTERES = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicilizaVistas();
    }


    private void inicilizaVistas() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnPalab = findViewById(R.id.btnPalabras);
        btnCarac = findViewById(R.id.btnCaracteres);
    }

    //En el view asignar esta funcion al la propiedad onCLick del boton
    public void onClickBotones(View boton){
        String frase = txtFrase.getText().toString();
        if (!frase.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putString("FRASE", frase);

            bundle.putInt("OPERACION",boton.getId());
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}