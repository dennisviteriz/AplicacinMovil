package com.example.aplicacinmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    TextView textView12;
    DatePickerDialog.OnDateSetListener listener ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView12 = findViewById(R.id.textView12);


        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,android.R.style.Theme_Holo_Dialog_MinWidth,listener,year,month,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        listener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                month = month +1 ;
                String date = dayOfMonth + "/" + month + "/" + year;
                textView12.setText(date);
            }
        };




        Button buttonSiguiente = (Button) findViewById(R.id.buttonSiguiente);

        final EditText editNombre = (EditText) findViewById(R.id.editNombre);
        final EditText editTelefono = (EditText) findViewById(R.id.editTelefono);
        final EditText editEmail = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        final EditText editDescrip = (EditText) findViewById(R.id.editTextTextPersonName);


        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("nombre",editNombre.getText().toString());
                intent.putExtra("telefono",editTelefono.getText().toString());
                intent.putExtra("email",editEmail.getText().toString());
                intent.putExtra("descrip",editDescrip.getText().toString());
                intent.putExtra("fecha",textView12.getText().toString());

                startActivity(intent);
            }
        });





    }
}