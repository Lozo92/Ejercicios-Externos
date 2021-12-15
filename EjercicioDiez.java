package com.jonathan;

public class EjercicioDiez {

    public static void main(String[] args) {


        //Crear programa que calcule el area de un rectángulo.

        double base = 100;
        double altura = 10;

        double areaRectangulo = base * altura;

        System.out.println(areaRectangulo + " cm cuadrados");



        //Crear programa que calcule el area de un triángulo.

        double baseTriangulo = 5;
        double alturaTriangulo = 10;

        double areaTriangulo = baseTriangulo * alturaTriangulo / 2;
        System.out.println(areaTriangulo);



        //Crear programa que calcule el precio total de una factura a partir de la base imponible.

        double baseImponible = 100;
        double ivaAplicar = 1.21;

        double totalFactura = baseImponible * ivaAplicar;

        System.out.println(totalFactura);


        //Calcular un salario semanal.

        int horasTrabajadas = 40;
        int eurosHora = 12;

        int salarioSemanal = horasTrabajadas * eurosHora;

        System.out.println(salarioSemanal);
    }
}
