package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Humano implements ComportamientoHumano, AccionesComunes {
    private String nombre;
    private LocalDate fechaNacimiento;

    private List<Cancion> lstCancion = new ArrayList<Cancion>();


    public Humano(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    //Metodos de la interface AccionesComunes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void dormir() {
        System.out.println("Soy " + this.getNombre() + " y estoy durmiendo");
    }

    public void alimentarse() {
        System.out.println("Soy " + this.getNombre() + " y estoy comiendo");
    }

    public void hablar() {
        System.out.println("Soy " + this.getNombre() + " y te saludo");
    }

    //Metodos de la interface ComportamientoHumano
    public void estudiar() {
        System.out.println("Soy " + this.getNombre() + " y estoy haciendo tal");
    }

    public String compararEdad(Humano h) {
        if (this.fechaNacimiento.isBefore(h.getFechaNacimiento())) {
            return this.nombre;
        } else {
            return h.getNombre();
        }
    }

    public void trabajar() {

    }

    public void listarCanciones() {
        for (int i = 0; i < lstCancion.size(); i++) {
            System.out.println(">> " + lstCancion.get(i).getNombre());
        }
    }

    public void buscarCancion(String nombre) {
        boolean b = false;
        for (int i = 0; i < lstCancion.size(); i++) {
            if (this.lstCancion.get(i).getNombre().equals(nombre)) {
                b = true;
            }
        }
        if (b) {
            System.out.println("La cancion SI esta en la lista");
        }else{
            System.out.println("La cancion NO esta en la lista");
        }
    }

    public void anyadirCancion(Cancion c){
        this.lstCancion.add(c);
    }
}