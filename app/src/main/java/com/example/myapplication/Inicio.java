package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity implements View.OnClickListener {
    private Button b,b2,b3,b4,b5;
    private EditText e;
    private TextView t,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        b=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);

        e=(EditText) findViewById(R.id.editTextText);

        t=(TextView) findViewById(R.id.textView4);
        t8=(TextView) findViewById(R.id.textView8);

        b.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.button2) {
            String texto = e.getText().toString();
            if(texto.equals("admin")){
                Intent intent = new Intent(Inicio.this,Vista1.class);
                startActivity(intent);
                finish();
            }else{
                t8.setText("Usuario incorrecto. Intenta de nuevo.");
            }

        }
        if(view.getId()==R.id.button3){
            Intent intent = new Intent(Inicio.this,Vista2.class);
            startActivity(intent);
            finish();
        }
        if(view.getId()==R.id.button4){
            Intent intent = new Intent(Inicio.this,Vista3.class);
            startActivity(intent);
            finish();
        }
        if(view.getId()==R.id.button5){
            String texto = e.getText().toString();
            t8.setText("Hola" + texto);
        }

        t.setText("Patas de pollo");
    }

}

