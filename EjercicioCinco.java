package com.jonathan;

public class EjercicioCinco {

    public static void main(String[] args) {

        //Se declaran variables y se les asigna un valor y se muestran en pantalla:
        int x = 144;
        int y = 999;

        System.out.println(x);
        System.out.println(y);

        //Se realizan operaciones matemáticas con las variables:
        int suma = x + y;
        int resta = x - y;
        double division = (double)x / (double) y;
        int multiplicacion = x * y;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

        //Declarar e imprimir una variable que contenga mi nombre:
        String nombre = "Jonathan Lozano Casanova";
        System.out.println("Mi nombre es: " + nombre);

        //Declarar variables que contengan nombre, dirección y número de teléfono e imprimir en pantalla:
        String direccion = "Calle General";
        int numeroTelefono = 633833373;
        System.out.println("Mi nombre es: " + nombre + "." + " " + "Mi dirección es: " + direccion + " " +
                "y mi numero es: " + " " + numeroTelefono);
    }
}
