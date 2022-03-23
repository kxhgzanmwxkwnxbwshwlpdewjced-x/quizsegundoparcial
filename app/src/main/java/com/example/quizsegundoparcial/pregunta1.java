package com.example.quizsegundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pregunta1 extends AppCompatActivity {
    Button respuesta11;
    Button respuesta12;
    Button respuesta13;
    Button siguiente;
    Button salir0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
        respuesta11 = findViewById(R.id.radioButton1);
        respuesta12 = findViewById(R.id.radioButton2);
        respuesta13 = findViewById(R.id.radioButton3);
        siguiente = findViewById(R.id.boton11);
        salir0 = findViewById(R.id.boton12);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("siguientePregunta...");
                SiguientePregunta();
            }
        });

        salir0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a las preguntas...");
                RegresarseALasPreguntas();
            }
        });

    }
    private void SiguientePregunta()
    {
        Intent i = new Intent( this, pregunta2.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }
}
    