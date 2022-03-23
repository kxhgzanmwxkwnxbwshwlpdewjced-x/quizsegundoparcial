package com.example.quizsegundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pregunta6 extends AppCompatActivity {
    Button respuesta29, respuesta30, anterior5, siguiente5, salir5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta6);
        respuesta29 = findViewById(R.id.radioButton18);
        respuesta30 = findViewById(R.id.radioButton19);
        anterior5 = findViewById(R.id.boton25);
        siguiente5 = findViewById(R.id.boton26);
        salir5 = findViewById(R.id.boton27);

        anterior5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();
            }
        });

        siguiente5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("siguiente pregunta...");
                SiguientePregunta();
            }
        });

        salir5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });
    }
    private void PreguntaAnterior ()
    {
        Intent i= new Intent(this, pregunta5.class);
        startActivity(i);
    }

    private void SiguientePregunta()
    {
        Intent i= new Intent(this, pregunta7.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }
}