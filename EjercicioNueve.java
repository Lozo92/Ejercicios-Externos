package com.jonathan;

import java.util.Scanner;

public class EjercicioNueve {

    public static void main(String[] args) {

        //Crear programa que lea en pantalla dos números e imprima operaciones matemáticas.

        //Para leer en pantalla se crea objeto de la clase Scanner indicando la clase System.in
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce dos números para operar con ellos: ");

        //Se crean las variables que se deberán escribir en la consola.
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        //Se declaran las variables con las operaciones matemáticas que realizará el programa.
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
    }
}
