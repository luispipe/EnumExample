package com.example.aleatorios;
import lombok.AllArgsConstructor;
import  lombok.Data;
import lombok.RequiredArgsConstructor;

//Cuando se define un data Class se genera de forma implicita
// los metodos getter and setter de los atributos de la clase
@Data
@RequiredArgsConstructor
public class DiasLaborales {
    private int dia;
    private int mes;


}
