package com.jonathan;

import java.util.Scanner;

public class EjercicioCatorce {

    public static void main(String[] args) {

        int sueldoSemanal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las horas que has trabajado esta semana: ");
        int horasTrabajadas = scanner.nextInt();

        if(horasTrabajadas <= 40){
            sueldoSemanal = horasTrabajadas * 12;
        }

        else{
            sueldoSemanal = (40*12) + ((horasTrabajadas - 40) *16);
        }
        System.out.println("Tu sueldo semanal es: " + sueldoSemanal + " euros");
    }
}
