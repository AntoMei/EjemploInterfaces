package com.company;

import java.time.LocalDate;

public class Mujer extends Humano{
    public Mujer(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    @Override
    public void trabajar(){
        System.out.println("Me llamo "+this.getNombre()+" y sere la mejor en ingeniera de sistemas");
    }
}
