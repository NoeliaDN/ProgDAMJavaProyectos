/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T6.Pila;
import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author Noelia
 */
public class PilaDePlatos {
    //Ejemplo pila para fregar platos
    
    public static void main(String[] args){
        
        Stack<String> platosSucios = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String opcion;
        
        do{
            System.out.println("---MENU FREGADERO---");
            System.out.println("1. Apilar plato sucio. ");
            System.out.println("2. Lavar plato. ");
            System.out.println("3. Mostrar pila de platos sucios. ");
            System.out.println("4. Salir ");
            opcion= sc.nextLine();
            
            switch(opcion){
                case "1": 
                    System.out.println("Nombre del plato sucio: ");
                    platosSucios.push(sc.nextLine());// para agregar elementos a la pila
                    System.out.println("Plato agregado. ");
                    break;
                case "2": 
                    if(platosSucios.isEmpty()){
                        System.out.println("No hay platos sucios");
                        
                    } else{
                        String plato = platosSucios.pop();//para eliminar elementos de la pila
                        System.out.println("Limpiado el plato: " + plato);
                    }
                    break;
                    case"3":
                        System.out.println("PLATOS EN EL FREGADERO: ");
                        
                        for (String plato : platosSucios){
                                 System.out.println(plato);

                        }
                        break;
                    case "4":
                            System.out.println("Salir");
                            break;
                    default: 
                            System.out.println("Opción no válida.");
                   
                    
            }
                                  
            
        }
        while(!platosSucios.equals("4"));
    
    }
}
