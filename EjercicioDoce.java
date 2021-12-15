package com.jonathan;

import java.util.Scanner;

public class EjercicioDoce {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una hora de 6 de la mañana a 5 de la noche");

        int hora = scanner.nextInt();

        if(hora >= 6 && hora <= 12){
            System.out.println("Buenos días");
        }
        else if(hora >= 13 && hora <= 21){
            System.out.println("Buenas tardes");
        }
        else{
            System.out.println("Buenas noches");
        }

    }
}
