package com.jonathan;

import java.util.Scanner;

public class EjercicioDieciseis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Se va a calcular la media de tres notas:");

        System.out.println("Introduce la primera nota");
        double nota1 = scanner.nextDouble();

        System.out.println("Introduce la segunda nota");
        double nota2 = scanner.nextDouble();

        System.out.println("Introduce la tercera nota");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media de las notas es:\n" + media);
    }
}
