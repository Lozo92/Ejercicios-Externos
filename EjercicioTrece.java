package com.jonathan;

import java.util.Scanner;

public class EjercicioTrece {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 7");

        int numero = scanner.nextInt();
        String dia;

        switch (numero) {

            case 1:
                dia = "Lunes";
                break;

            case 2:
                dia = "Martes";
                break;

            case 3:
                dia = "Miércoles";
                break;

                case 4:
                dia = "Jueves";
                break;

                case 5:
                dia = "Viernes";
                break;

                case 6:
                dia = "Sábado";
                break;

                case 7:
                dia = "Domingo";
                break;

                default:
                dia = "No existe el día de la semana";
        }
        System.out.println("El día elegido es: " + dia);
    }
}
