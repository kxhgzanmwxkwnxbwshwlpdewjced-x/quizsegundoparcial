package com.example.quizsegundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pregunta2 extends AppCompatActivity {
    Button respuesta14, respuesta15, anterior1, siguiente1, salir1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
        respuesta14 = findViewById(R.id.radioButton4);
        respuesta15 = findViewById(R.id.radioButton5);
        anterior1 = findViewById(R.id.boton13);
        siguiente1 = findViewById(R.id.boton14);
        salir1 = findViewById(R.id.boton15);

        anterior1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();

            }
        });

        siguiente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                SiguientePregunta();
            }
        });

        salir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });
    }
    private void PreguntaAnterior()
    {
        Intent i= new Intent(this, pregunta1.class);
        startActivity(i);
    }

    private void SiguientePregunta()
    {
        Intent i= new Intent(this, pregunta3.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }
}