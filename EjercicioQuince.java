package com.jonathan;

import java.util.Scanner;

public class EjercicioQuince {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("El programa resuelve ecuaciones de primer grado: ax + b = 0");
        System.out.println("Introduce un valor para a");
        double a = scanner.nextDouble();

        System.out.println("Ahora introduce un valor para b");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("La ecuación no se puede resolver");
        }
        else{
            System.out.println("el valor de x es: " + (-b / a));
        }
    }
}
