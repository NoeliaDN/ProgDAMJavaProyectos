/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T6.ProyectoTienda;
import java.util.Scanner;
/**
 *
 * @author Noelia
 */
public class Tienda {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CarritoCompras carrito = new CarritoCompras();
        String opcion, nombre;
        double precio;
        int cantidad;
        
        do{
            System.out.println("---MENU---");
            System.out.println("1. Agregar producto al carrito. ");
            System.out.println("2. Eliminar producto del carrito. ");
            System.out.println("3. Mostrar carrito. ");
            System.out.println("4. Vaciar carrito. ");
            System.out.println("5. Salir ");
            opcion= sc.nextLine();
            
            switch(opcion){
                case "1": 
                    System.out.println("Ingrese el nombre del prodcuto: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el precio del prodcuto: ");
                    precio = sc.nextDouble();
                    System.out.println("Ingrese la cantidad del prodcuto: ");
                    cantidad = sc.nextInt();
                    
                    carrito.agregarProducto(nombre, precio, cantidad);
                    break;
                    case"2": 
                    System.out.println("Ingrese el nombre del prodcuto que desea eliminar: ");
                    nombre = sc.nextLine();
                    carrito.eliminarProducto(nombre);
                    break;
                    case "3": 
                        carrito.mostrarCarrito();
                        break;
                    case "4":
                        carrito.vaciarCarrito();
                        break;
                    case "5":
                        System.out.println("Adiós");
                        break;
                    default: 
                        System.out.println("Opción no válida");
                                           
                    
            }
            
        }while(!opcion.equals("5"));
        sc.close();//cerramos el Scanner
    
        
        
        
    }
}
