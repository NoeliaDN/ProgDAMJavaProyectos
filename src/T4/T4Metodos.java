/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package T4;
import T4.matematicas.Varias;
import T4.matematicas.Geometria;
import T4.matematicas.Factorial;

import java.util.Scanner;


/**
 *
 * @author Noelia
 */
public class T4Metodos {

    public static void main(String[] args) 
    { 
        Scanner teclado = new Scanner(System.in);
    
    int n; 
    
// Prueba esPrimo() 
    System.out.print("\n---PRUEBA PRIMOS---\n"); 
    System.out.print("Introduzca un número entero positivo: "); 
    n = teclado.nextInt(); 
if (T4.matematicas.Varias.esPrimo(n)) 
{ 
    System.out.println("El " + n + " es primo."); 
} 
else 
{ 
    System.out.println("El " + n + " no es primo."); 
} 

// Prueba digitos() 
System.out.print("\n---PRUEBA DIGITOS---\n"); 
System.out.print("Introduzca un número entero positivo: "); 
n = teclado.nextInt(); 
System.out.println(n + " tiene " + T4.matematicas.Varias.digitos(n) + " dígitos."); 

// Prueba volumenCilindro() 
System.out.print("\n---PRUEBA VOLUMEN CILINDRO---\n"); 
double r, h; 
System.out.println("Cálculo del volumen de un cilindro"); 
System.out.print("Introduzca el radio en metros: "); 
r = teclado.nextDouble(); 
System.out.print("Introduzca la altura en metros: "); 
h = teclado.nextDouble(); 
System.out.println("El volumen del cilindro es " + T4.matematicas.Geometria.volumenCilindro(r, h) + " m3"); 

System.out.print("\n---PRUEBA FACTORIAL---\n"); 

Factorial f= new Factorial(); 

System.out.println("Factorial utilizando un método recursivo:"); 
System.out.println("El factorial de 3 es: "+f.facR(3)); 
System.out.println("El factorial de 6 es: "+f.facR(6)); 
System.out.println(); System.out.println("Factorial utilizando un método iterativo:"); 
System.out.println("El factorial de 3 es: "+f.facI(3)); 
System.out.println("El factorial de 6 es: "+f.facI(6));

System.out.print("\n---PRUEBA POTENCIA---\n");



}

    
}
