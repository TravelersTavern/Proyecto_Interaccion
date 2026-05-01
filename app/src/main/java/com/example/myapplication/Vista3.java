package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Vista3 extends AppCompatActivity implements View.OnClickListener {

    private EditText eContacto1;
    private EditText eContacto2;
    private EditText eContacto3;
    private TextView tEstadoAlerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista3);

        eContacto1 = findViewById(R.id.editContacto1);
        eContacto2 = findViewById(R.id.editContacto2);
        eContacto3 = findViewById(R.id.editContacto3);
        tEstadoAlerta = findViewById(R.id.textEstadoAlerta);

        Button bEnviar = findViewById(R.id.buttonEnviarAlerta);
        Button bSilenciosa = findViewById(R.id.buttonAlertaSilenciosa);

        bEnviar.setOnClickListener(this);
        bSilenciosa.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        boolean silenciosa = view.getId() == R.id.buttonAlertaSilenciosa;
        if (!hasAtLeastOneContact()) {
            tEstadoAlerta.setText(R.string.alert_error_no_contact);
            return;
        }

        String time = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
        if (silenciosa) {
            tEstadoAlerta.setText(getString(R.string.alert_sent_silent_template, time));
        } else {
            tEstadoAlerta.setText(getString(R.string.alert_sent_template, time));
        }
    }

    private boolean hasAtLeastOneContact() {
        return !eContacto1.getText().toString().trim().isEmpty()
                || !eContacto2.getText().toString().trim().isEmpty()
                || !eContacto3.getText().toString().trim().isEmpty();
    }

}