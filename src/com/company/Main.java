package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        //Lista canciones de la mujer
        Cancion c1 = new Cancion("You say", 123);
        Cancion c2 = new Cancion("Another in the fire", 456);
        Cancion c3 = new Cancion("Asian", 789);
        Cancion c4 = new Cancion("Real love", 101);

        //Lista canciones del hombre
        Cancion c5 = new Cancion("Fuego de Dios", 102);
        Cancion c6 = new Cancion("A ti la gloria", 103);
        Cancion c7 = new Cancion("Mama mia", 104);
        Cancion c8 = new Cancion("Macarena", 105);

        //Creamos fechas con LocalDate
        LocalDate d1 = LocalDate.of(2000, Month.JULY,4);
        LocalDate d2 = LocalDate.of(1976, Month.APRIL,11);

        Humano h1 = new Mujer("Monica Matamoros", d1);
        Humano h2 = new Hombre("David Salgado", d2);

        //Lista de canciones de la mujer
        h1.anyadirCancion(c1);
        h1.anyadirCancion(c2);
        h1.anyadirCancion(c4);
        h1.anyadirCancion(c4);

        //Lista de canciones del hombre
        h1.anyadirCancion(c5);
        h1.anyadirCancion(c6);
        h1.anyadirCancion(c7);
        h1.anyadirCancion(c8);

        //Presentacion en pantalla
        System.out.println("====================");
        System.out.println("Comportamiento humano ");
        System.out.println("====================");
        System.out.println("\n");
        System.out.println("====Mujer=============");
        h1.hablar();
        h1.estudiar();
        h1.trabajar();
        System.out.println("Lista de canciones de :" +h1.getNombre());
        h1.listarCanciones();
        System.out.println("Buscamos cancion : Asian");
        h1.buscarCancion("Asian");

        System.out.println("====Hombre=============");
        h2.hablar();
        h2.estudiar();
        h2.trabajar();
        System.out.println("Lista de canciones de :" +h2.getNombre());
        h2.listarCanciones();
        System.out.println("Buscamos cancion : Fuego de Dios");
        h2.buscarCancion("Fuego de Dios");
    }
}
