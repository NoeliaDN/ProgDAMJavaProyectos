package com.example;

import java.util.Scanner;

public class T3ARRAYS {
    public static void main(String[] args) {

        int [] notas = new int[3]; // tiene tamaño 3, por lo que ahí estaría el límite de datos a introducir en este ejemplo, siempre empezando en index 0.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime la primera nota: ");
        notas[0] = entrada.nextInt();

        System.out.println("Dime la segunda nota: ");
        notas[1] = entrada.nextInt();

        System.out.println("Dime la tercera nota: ");
        notas[2] = entrada.nextInt();

        System.out.println("\nLa primera nota es: " + notas[0]);
        System.out.println("\nLa segunda nota es: " + notas[1]);
        System.out.println("\nLa tercera nota es: " + notas[2]);

    }
}
