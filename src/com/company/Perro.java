package com.company;

import java.time.LocalDate;

public class Perro extends Animal{

    public Perro(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    @Override
    public void hablar() {
    //Metodo no implementado: los perros no hablan
    }
}
