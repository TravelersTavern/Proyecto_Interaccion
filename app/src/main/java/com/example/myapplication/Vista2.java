package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Vista2 extends AppCompatActivity implements View.OnClickListener {

    private EditText eDistanciaKm;
    private EditText eVelocidadPromedio;
    private TextView tResultadoEta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista2);

        eDistanciaKm = findViewById(R.id.editDistanciaKm);
        eVelocidadPromedio = findViewById(R.id.editVelocidadPromedio);
        tResultadoEta = findViewById(R.id.textEtaResultado);
        Button bCalcularEta = findViewById(R.id.buttonCalcularEta);
        bCalcularEta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String distanciaRaw = eDistanciaKm.getText().toString().trim();
        String velocidadRaw = eVelocidadPromedio.getText().toString().trim();

        if (distanciaRaw.isEmpty() || velocidadRaw.isEmpty()) {
            tResultadoEta.setText(R.string.eta_error_empty_fields);
            return;
        }

        try {
            double distancia = Double.parseDouble(distanciaRaw);
            double velocidad = Double.parseDouble(velocidadRaw);
            int eta = EtaCalculator.estimateMinutes(distancia, velocidad, 1.25);
            tResultadoEta.setText(getString(R.string.eta_result_template, eta));
        } catch (NumberFormatException ex) {
            tResultadoEta.setText(R.string.eta_error_invalid_number);
        } catch (IllegalArgumentException ex) {
            tResultadoEta.setText(ex.getMessage());
        }
    }

}