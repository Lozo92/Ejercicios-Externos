package com.jonathan;

import java.util.Scanner;

public class EjercicioOnce {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un día de la semana:");

        String dia = scanner.next();
        String clase;

        switch (dia) {

            case "lunes":
                clase = "matemáticas";
                break;

            case "martes":
                clase = "física";
                break;

            case "miercoles":
                clase = "química";
                break;

            case "jueves":
                clase = "Educación física";
                break;

            case "viernes":
                clase = "castellano";
                break;

            default:
                clase = "Es fin de semana";
        }
        System.out.println("A primera hora del " + dia + " toca: " + clase);
    }
}
