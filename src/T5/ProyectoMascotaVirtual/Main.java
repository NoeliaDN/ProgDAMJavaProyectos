/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T5.ProyectoMascotaVirtual;
import java.util.Scanner;
/**
 //TODO: controlar la excepción en caso de que no haya perros aún.
 * @author Noelia
 */
public class Main {
    
    public static void main(String[] args){
    //Instanciar a un nuevo perro:
    
    //Perro perro1 = new Perro();
    int opcion;
    String nombre;
    int auxPerros;
    
    Scanner scn = new Scanner(System.in);
    
    
    //Creamos un array de 100 elementos, para qu pueda haber un máximo de 100 perros:
    Perro[] perros = new Perro[100];
    
    do{
        //Damos opciones:
        opcion= mostrarMenu();
        
        //Según opcion hacemos
        
        switch(opcion){
            case 1:
                System.out.println("\nHa nacido un nuevo cachorro");
                System.out.println("Dime su nombre");
                nombre = scn.next();
                perros[Perro.numPerros]= new Perro(nombre);
                Perro.numPerros++;
                break;         
            case 2:
                System.out.println("\n¿A qué perro quieres darle de comer? Hay " + Perro.numPerros);
                auxPerros = scn.nextInt();
                perros[auxPerros-1].comer();
                break;
            case 3:
                System.out.println("¿Qué perro puede jugar? Hay " + Perro.numPerros);
                auxPerros = scn.nextInt();
                perros[auxPerros-1].jugar();
                break;
            case 4:
                System.out.println("¿Qué perro puede dormir? Hay " + Perro.numPerros);
                auxPerros = scn.nextInt();
                perros[auxPerros-1].dormir();
                break;
            case 5:
                System.out.println("¿De qué perro quieres saber el estado? Hay " + Perro.numPerros);
                auxPerros = scn.nextInt();
                perros[auxPerros-1].mostrarEstado();
                break;
            case 6:
                System.out.println("Gracias por jugar");
            default:
                System.out.println("Opción no válida");
                
                
                
        }
        
    }while(opcion != 6);
    
    
        
    }
    
    public static int mostrarMenu(){
        Scanner lector = new Scanner(System.in);
        System.out.println("\n1. Crear perro.");
        System.out.println("2. Dar de comer.");
        System.out.println("3. Jugar.");
        System.out.println("4. Dormir.");
        System.out.println("5. Mostrar estado.");
        System.out.println("6. Salir.");
        
        return lector.nextInt();
    
    
    
    }
}
