package com.example;

import java.util.Scanner;

public class T3ARRAYS {
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

        System.out.println(notas.length); // imprimimos el tamaño del array, en este caso 10.

        System.out.println(notas2.length); // imprimimos el tamaño del array, en este caso 10.

        // Vamos ahora a calcular la nota media total de la clase:
        for (i = 0; i < notas2.length; i++) {
            suma += notas2[i]; // sumamos todas las notas

        }

        suma = suma / notas2.length; // calculamos la media
        
        System.out.println("La media de la clase es: " + suma); // mostramos la media
        
        //entrada.close(); // cerramos el scanner
        //entrada2.close(); // cerramos el scanner



    }
}
        
 