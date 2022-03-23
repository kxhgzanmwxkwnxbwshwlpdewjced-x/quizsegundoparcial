package com.example.quizsegundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pregunta7 extends AppCompatActivity {
    Button respuesta29, respuesta30, anterior6, siguiente6, salir6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta7);
        respuesta29 = findViewById(R.id.radioButton20);
        respuesta30 = findViewById(R.id.radioButton21);
        anterior6 = findViewById(R.id.boton28);
        siguiente6 = findViewById(R.id.boton29);
        salir6 = findViewById(R.id.boton30);

        anterior6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();
            }
        });

        siguiente6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("siguiente pregunta...");
                SiguientePregunta();
            }
        });

        salir6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });
    }
    private void PreguntaAnterior()
    {
        Intent i= new Intent(this, pregunta6.class);
        startActivity(i);
    }
    private void SiguientePregunta()
    {
        Intent i= new Intent(this, pregunta8.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }
}