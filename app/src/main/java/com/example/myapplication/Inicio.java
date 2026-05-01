package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity implements View.OnClickListener {
    private Button bMapa;
    private Button bModoCertero;
    private Button bAlerta;
    private TextView tEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        bMapa = findViewById(R.id.buttonMapa);
        bModoCertero = findViewById(R.id.buttonModoCertero);
        bAlerta = findViewById(R.id.buttonAlertaCero);
        tEstado = findViewById(R.id.textEstadoInicio);

        bMapa.setOnClickListener(this);
        bModoCertero.setOnClickListener(this);
        bAlerta.setOnClickListener(this);

        tEstado.setText(getString(R.string.inicio_status_ready));
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonMapa) {
            Intent intent = new Intent(Inicio.this, Vista1.class);
            startActivity(intent);
            return;
        }

        if (view.getId() == R.id.buttonModoCertero) {
            Intent intent = new Intent(Inicio.this, Vista2.class);
            startActivity(intent);
            return;
        }

        if (view.getId() == R.id.buttonAlertaCero) {
            Intent intent = new Intent(Inicio.this, Vista3.class);
            startActivity(intent);
        }
    }

}

