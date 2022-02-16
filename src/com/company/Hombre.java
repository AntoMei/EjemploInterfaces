package com.company;

import java.time.LocalDate;

public class Hombre extends Humano{
    public Hombre(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    @Override
    public void trabajar(){
        System.out.println("Me llamo "+this.getNombre()+" y sere el mejor en ingeniera de sistemas");
    }
}
