package com.example.quizsegundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pregunta3 extends AppCompatActivity {
    Button respuesta16, respuesta17, anterior2, siguiente2, salir2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
        respuesta16 = findViewById(R.id.radioButton6);
        respuesta17 = findViewById(R.id.radioButton7);
        anterior2 = findViewById(R.id.boton16);
        siguiente2 = findViewById(R.id.boton17);
        salir2 = findViewById(R.id.boton18);

        anterior2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();
            }
        });

        siguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("siguiente pregunta...");
                SiguientePregunta();
            }
        });

        salir2.setOnClickListener(new View.OnClickListener() {
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
        Intent i= new Intent(this, pregunta4.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }
}