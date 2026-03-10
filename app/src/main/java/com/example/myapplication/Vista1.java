
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Vista1 extends AppCompatActivity implements View.OnClickListener{

    private Button bs,br,bm,bd;
    private EditText eNum1, eNum2;
    private TextView tResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista1);

        bs=(Button) findViewById(R.id.buttonS);
        br=(Button) findViewById(R.id.buttonR);
        bm=(Button) findViewById(R.id.buttonM);
        bd=(Button) findViewById(R.id.buttonD);

        eNum1=(EditText) findViewById(R.id.editTextNumberDecimal);
        eNum2=(EditText) findViewById(R.id.editTextNumberDecimal2);

        tResultado=(TextView) findViewById(R.id.textView10);

        bs.setOnClickListener(this);
        br.setOnClickListener(this);
        bm.setOnClickListener(this);
        bd.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String texto = eNum1.getText().toString();
        double numero1= Double.parseDouble(texto);
        String texto2 = eNum2.getText().toString();
        double numero2= Double.parseDouble(texto2);

        if(view.getId()==R.id.buttonS) {
            double res =numero1 + numero2;
            tResultado.setText("Resultado: "+res);
        }
        if(view.getId()==R.id.buttonR){
            double res =numero1 - numero2;
            tResultado.setText("Resultado: "+res);
        }
        if(view.getId()==R.id.buttonM){
            double res =numero1 * numero2;
            tResultado.setText("Resultado: "+res);
        }
        if(view.getId()==R.id.buttonD){
            if(numero2==0){
                tResultado.setText("El numero 2 no puede ser 0");
            }else{
                double res =numero1 / numero2;
                tResultado.setText("Resultado: "+res);
            }

        }

    }

}
