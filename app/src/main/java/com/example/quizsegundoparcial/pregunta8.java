package com.example.quizsegundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pregunta8 extends AppCompatActivity {

    Button respuesta29, respuesta30, respuesta31, respuesta32, respuesta33, respuesta34, anterior7, siguiente7, salir7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta8);
        respuesta29 = findViewById(R.id.radioButton22);
        respuesta30 = findViewById(R.id.radioButton23);
        respuesta31 = findViewById(R.id.radioButton24);
        respuesta32 = findViewById(R.id.radioButton25);
        respuesta33 = findViewById(R.id.radioButton26);
        respuesta34 = findViewById(R.id.radioButton27);
        anterior7 = findViewById(R.id.boton31);
        siguiente7 = findViewById(R.id.boton32);
        salir7 = findViewById(R.id.boton33);

        anterior7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();
            }
        });

        siguiente7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("siguiente pregunta...");
                SiguientePregunta();
            }
        });

        salir7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });
    }
    private void PreguntaAnterior()
    {
        Intent i= new Intent(this, pregunta7.class);
        startActivity(i);
    }

    private void SiguientePregunta()
    {
        Intent i= new Intent(this, pregunta9.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }
}