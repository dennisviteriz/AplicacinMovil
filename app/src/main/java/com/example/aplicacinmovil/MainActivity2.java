package com.example.aplicacinmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button buttonEditar = (Button) findViewById(R.id.buttonEditar);



        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView8 = (TextView) findViewById(R.id.textView8);
        final TextView textView9 = (TextView) findViewById(R.id.textView9);
       final TextView textView10 = (TextView) findViewById(R.id.textView10);
        final TextView textView11 = (TextView) findViewById(R.id.textView11);





        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("nombre");
        String fecha = parametros.getString("fecha");
        String telefono = parametros.getString("telefono");
        String email = parametros.getString("email");
        String descrip = parametros.getString("descrip");



        textView3.setText(nombre);
        textView8.setText(fecha);
        textView9.setText(telefono);
        textView10.setText(email);
        textView11.setText(descrip);


        buttonEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);


            }
        });


    }
}