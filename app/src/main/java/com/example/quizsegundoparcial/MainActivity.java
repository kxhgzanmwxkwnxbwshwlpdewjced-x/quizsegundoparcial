package com.example.quizsegundoparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView prueba;
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;
    Button boton7;
    Button boton8;
    Button boton9;
    Button boton10;
    Button salir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);
        boton4 = findViewById(R.id.boton4);
        boton5 = findViewById(R.id.boton5);
        boton6 = findViewById(R.id.boton6);
        boton7 = findViewById(R.id.boton7);
        boton8 = findViewById(R.id.boton8);
        boton9 = findViewById(R.id.boton9);
        boton10 = findViewById(R.id.boton10);
        salir = findViewById(R.id.salir);
        prueba = findViewById(R.id.prueba);



        prueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            }
        });

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("contesta la pregunta uno...");
                ContestarPreguntaUno();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("contesta la pregunta dos...");
                ContestarPreguntaDos();
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta 3");
                ContestarPreguntaTres();
                finish();
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta cuatro..");
                ContestarPreguntaCuatro();
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta cinco...");
                ContestarPreguntaCinco();
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta seis...");
                ContestarPreguntaSeis();
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregnta siete...");
                ContestarPreguntaSiete();
            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta ocho...");
                ContestarPreguntaOcho();
            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta nueve...");
                ContestarPreguntaNueve();
            }
        });

        boton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Contesta la pregunta diez...");
                ContestarPreguntaDiez();
            }
        });


        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        }

        private void ContestarPreguntaUno()
        {
            Intent i = new Intent(this, pregunta1.class);
            startActivity(i);
        }

        private void ContestarPreguntaDos()
        {
            Intent i = new Intent(this, pregunta2.class);
            startActivity(i);
        }

        private void ContestarPreguntaTres()
        {
            Intent i = new Intent(this, pregunta3.class);
            startActivity(i);
        }

        private void ContestarPreguntaCuatro()
        {
            Intent i = new Intent(this, pregunta4.class);
            startActivity(i);
        }
        private void ContestarPreguntaCinco()
        {
            Intent i = new Intent(this, pregunta5.class);
            startActivity(i);
        }

        private void ContestarPreguntaSeis()
        {
            Intent i = new Intent(this, pregunta6.class);
            startActivity(i);
        }

        private void ContestarPreguntaSiete()
        {
            Intent i = new Intent(this, pregunta7.class);
            startActivity(i);
        }

        private void ContestarPreguntaOcho()
        {
            Intent i = new Intent(this, pregunta8.class);
            startActivity(i);
        }

        private void ContestarPreguntaNueve()
        {
            Intent i = new Intent(this, pregunta9.class);
            startActivity(i);
        }

        private void ContestarPreguntaDiez()
        {
            Intent i = new Intent(this, pregunta10.class);
            startActivity(i);
        }
}