package com.example;

import java.util.Scanner;
import java.util.Arrays; // importamos la clase Arrays para usar sus métodos
import java.util.Random; // importamos la clase Random para generar números aleatorios

public class T3ARRAYS {

    public static int TAMANYO = 5;

    public static void main(String[] args) {
        int suma = 0;
        int[] notas = new int[3]; // tiene tamaño 3, por lo que ahí estaría el límite de datos a introducir en
                                  // este ejemplo, siempre empezando en index 0.
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

        // También podemos inicializar directamente:
        int[] notas2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // en este caso no es necesario indicar el tamaño del array,
        // ya que se inicializa directamente con los valores.

        Scanner entrada2 = new Scanner(System.in);

        for (int i = 0; i < 10; i++) { // También podemos usar notas2.length en vez de 10,
                                       // así nos vale para cualquier tamaño, el método length nos devuelve el tamaño
                                       // del array,
                                       // en este caso 10.
            System.out.println("Dime la nota " + (i) + ": ");
            notas2[i] = entrada2.nextInt(); // recogemos las notas
        }

        for (int i = 0; i < 10; i++) { // recorremos el array para mostrar las notas
            System.out.println("La nota " + (i) + " es: " + notas2[i]);
        }

        System.out.println(notas.length);

        System.out.println(notas2.length);

        // Vamos ahora a calcular la nota media total de la clase:
        for (i = 0; i < notas2.length; i++) {
            suma += notas2[i]; // sumamos todas las notas

        }

        suma = suma / notas2.length; // calculamos la media

        System.out.println("La media de la clase es: " + suma); // mostramos la media

        // entrada.close(); // cerramos el scanner
        // entrada2.close(); // cerramos el scanner

        // MATRIZ BIDIMENSIONAL. IDENTIFICAR MÑINIMO Y MÁXIMO

        int[][] matriz = new int[TAMANYO][TAMANYO]; // declaramos la matriz

        Random random = new Random(); // creamos un objeto de la clase Random para generar números aleatorios

        int max, min;
        // Rellenar la matriz aleatoriamente:

        for (int i = 0; i < TAMANYO; i++) { // recorremos las filas de la matriz
            for (int j = 0; j < TAMANYO; j++) { // recorremos las columnas de la matriz
                matriz[i][j] = random.nextInt(100) + 1; // generamos un número aleatorio entre 0 y 99 y lo asignamos a
                                                        // la
                // matriz
            }
        }

        // Mostrar la matriz por pantalla:
        System.out.println("La matriz es: ");
        for (int i = 0; i < TAMANYO; i++) { // recorremos las filas de la matriz
            for (int j = 0; j < TAMANYO; j++) { // recorremos las columnas de la matriz
                System.out.print(matriz[i][j] + " "); // mostramos el elemento de la matriz
            }
            System.out.println(); // saltamos a la siguiente línea
        }

        max = matriz[0][0]; // inicializamos el máximo con el primer elemento de la matriz
        min = matriz[0][0]; // inicializamos el mínimo con el primer elemento de la matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) { // si el elemento es mayor que el máximo
                    max = matriz[i][j]; // lo asignamos como nuevo máximo
                }
                if (matriz[i][j] < min) { // si el elemento es menor que el mínimo
                    min = matriz[i][j]; // lo asignamos como nuevo mínimo
                }
            }
        }
        System.out.println("El máximo es: " + max); // mostramos el máximo
        System.out.println("El mínimo es: " + min); // mostramos el mínimo

        // MATRIZ 3 DIMENSIONES:

        // Crear un array tridimensional para almacenar ventas
        // Dimensiones: 3 regiones, 4 productos, 4 trimestres
        double[][][] ventas = new double[3][4][4];
        Random random1 = new Random();
        // Llenar el array con datos (pueden ser generados o ingresados manualmente)
        for (int region = 0; region < ventas.length; region++) {
            for (int producto = 0; producto < ventas[region].length; producto++) {
                for (int trimestre = 0; trimestre < ventas[region][producto].length; trimestre++) {
                    ventas[region][producto][trimestre] = random1.nextInt(100) + 1;
                    ;
                }
            }
        }
        // Mostrar las ventas por región, producto y trimestre
        System.out.println("Reporte de Ventas:");
        for (int region = 0; region < ventas.length; region++) {
            System.out.println("Región " + (region + 1) + ":");
            for (int producto = 0; producto < ventas[region].length; producto++) {
                System.out.print(" Producto " + (producto + 1) + ": ");
                for (int trimestre = 0; trimestre < ventas[region][producto].length; trimestre++) {
                    System.out.printf("T%d: %.2f ", trimestre + 1, ventas[region][producto][trimestre]);
                }
                System.out.println();
            }
            System.out.println();
        }
        // Calcular la suma total de ventas
        double totalVentas = 0;
        for (int region = 0; region < ventas.length; region++) {
            for (int producto = 0; producto < ventas[region].length; producto++) {
                for (int trimestre = 0; trimestre < ventas[region][producto].length; trimestre++) {
                    totalVentas += ventas[region][producto][trimestre];
                }
            }
        }
        System.out.printf("Total de ventas: %.2f%n", totalVentas);

    }
}
