package com.example.quizsegundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pregunta4 extends AppCompatActivity {
    Button respuesta18, respuesta19, respuesta20, respuesta21, respuesta22, respuesta23, respuesta24, respuesta25, anterior3, siguiente3, salir3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4);
        respuesta18 = findViewById(R.id.radioButton8);
        respuesta19 = findViewById(R.id.radioButton9);
        respuesta20 = findViewById(R.id.radioButton10);
        respuesta21 = findViewById(R.id.radioButton11);
        respuesta22 = findViewById(R.id.radioButton12);
        respuesta23 = findViewById(R.id.radioButton13);
        respuesta24 = findViewById(R.id.radioButton14);
        respuesta25 = findViewById(R.id.radioButton15);
        anterior3 = findViewById(R.id.boton19);
        siguiente3 = findViewById(R.id.boton20);
        salir3 = findViewById(R.id.boton21);

        anterior3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();
            }
        });

        siguiente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("siguiente pregunta...");
                SiguientePregunta();
            }
        });

        salir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });
    }
    private void PreguntaAnterior()
    {
        Intent i= new Intent(this, pregunta3.class);
        startActivity(i);
    }

    private void SiguientePregunta()
    {
        Intent i= new Intent(this, pregunta5.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }
}