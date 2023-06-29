package com.example.aleatorios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DiasLaborales diaLaboral= new DiasLaborales();

        enum DiaSemana{
            Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo;

            public boolean esFindeSemana(){
                return this == Sabado || this == Domingo;
            }
        }

        DiaSemana dia= DiaSemana.Sabado;
        Log.i("Es fin de semana",  dia.esFindeSemana()+"");
        switch (dia){
            case Lunes:
            case Martes:
            case Miercoles:
            case Jueves:
            case Viernes:
                Log.i("Switch", "Es día laboral" );
                break;
            case Sabado:
            case Domingo:
                Log.i("Switch", "Es fin de semana" );
                break;
        }

    }
}