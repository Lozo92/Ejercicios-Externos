package com.jonathan;

import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un nombre: ");
        String nombre = scanner.next();

        System.out.println("Ahora, introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Tu nombre es: " + nombre + " y tu edad es: " + edad + " años");


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Introduce dos números enteros: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        int multiplicacion = numero1 * numero2;
        System.out.println("La multiplicación de los dos números es: " + multiplicacion);
    }
}
