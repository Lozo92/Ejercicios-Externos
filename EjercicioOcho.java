package com.jonathan;

import java.util.Scanner;

public class EjercicioOcho {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cantidad de euros: ");
        double euros = scanner.nextDouble();

        double pesetas = euros * 166.38;
        System.out.println("La cantidad de euros corresponde a: " + pesetas + " pesetas");


        System.out.println("Introduce una cantidad de pesetas: ");
        double pesetas1 = scanner.nextDouble();

        double euros1 = pesetas1 * 0.0060;
        System.out.println("La cantidad de pesetas corresponde a: " + euros1 + " euros");
    }
}
