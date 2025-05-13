/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T6.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Noelia
 */
public class ArrayListAgenda {
    
    public static void main(String[] arg){
        
        ArrayList<String> miAgenda = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String opcion, nombre;
        
        do{
            System.out.println("---MENU---");
            System.out.println("1. Agregar nombre. ");
            System.out.println("2. Eliminar nombre. ");
            System.out.println("3. Mostrar nombre. ");
            System.out.println("4. Salir. ");
            System.out.println("\nOpcion: ");
            opcion= sc.nextLine();
            
            switch(opcion){
                case "1":
                    System.out.print("\nNombre:  ");
                    nombre = sc.nextLine();
                    miAgenda.add(nombre);// se agrega el nombre a la última posición
                    System.out.println("\nNombre agregado: "+ nombre);
                    
                    break;
                case "2": 
                    System.out.println("Nombre a eliminar:  ");
                    nombre= sc.nextLine();
                    
                    if(miAgenda.contains(nombre)){//método contains
                        miAgenda.remove(nombre);// elimina la primera ocuiurrencia de ese nombre
                    }else{
                        System.out.println("No existe el nombre: " + nombre);
                    }
                    break;
                    
                case "3":
                     System.out.println("\nListar agenda: ");
                     
                     //comprobar antes si está vacía:
                     
                     if(miAgenda.isEmpty()){
                          System.out.println("\nLa agenda está vacía, no hay nada que mostrar. ");
                                                 
                     }else{
                          System.out.println("\nContenido de la agenda:  ");
                          
                          for (String i : miAgenda){ //for especial (como el foreach)
                              
                               System.out.println(i);
                                              
                              }
                          
                     }
                     break;
                     
                case "4":
                     System.out.println("Salir");
                default:  System.out.println("Opción inválida.");                  
                   
                    
            }

        }while(!opcion.equals("4"));
        
    }
}
