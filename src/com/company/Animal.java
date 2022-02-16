package com.company;

import java.time.LocalDate;

public abstract class Animal implements AccionesComunes{
    private String nombre;
    private LocalDate fechaNacimiento;

    public Animal(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void dormir(){
        System.out.println("zzzzZZZzzZZZZZzzzz");
    }

    public void alimentarse(){
        System.out.println("MMMMMMmmmm");
    }
}