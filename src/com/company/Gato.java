package com.company;

import java.time.LocalDate;

public class Gato extends Animal{
    public Gato(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    @Override
    public void hablar() {
    //Hablar no es usado por los gatos
    }
}
