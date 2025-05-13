/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T6.ProyectoTienda;
import java.util.ArrayList;

/**
 *
 * @author Noelia
 */
public class CarritoCompras {
    
    private ArrayList <Producto> productos;
    
    //CONSTRUCTOR:
    public CarritoCompras(){
        productos = new ArrayList<Producto>();
    }
    
    //MËTODOS:
    public void agregarProducto(Producto producto){
        //Trabajamos sin duplicados
        boolean existe = false;
        for(Producto p : productos){
            if(p.getNombre().equals(producto.getNombre())){
                existe=true;
                System.out.println("Producto ya en el carrito. No se agrega.  ");
                break;
            }
        }
        
        if (!existe){
            productos.add(producto);
        }
        
        //O podemos simplemente hacer:
        
        // productos.add(producto);
    }
    
    //Otra opción de método para agregar:
    
    public void agregarProducto(String nombre, double precio, int cantidad){
        Producto producto = new Producto(nombre, precio, cantidad);
        productos.add(producto);
        
    }
    
    public void eliminarProducto(String nombre){
        boolean encontrado = false;
        
        for(Producto p : productos){
            if(p.getNombre().equals(nombre)){
                encontrado= true;
                productos.remove(p);
                System.out.println("Eliminado: " + nombre);
                break;
            }
        }
        
        if(!encontrado){
            System.out.println("El producto no está en el carrito");
        }
        
        
        
    }
    public void mostrarCarrito(){
            if(productos.isEmpty()){
                System.out.println("No hay productos");
            }else{
                System.out.println("\nMostrando carrito>: ");
                for(Producto producto : productos){
                    System.out.println(producto.toString()); //usando el formato de texto que sobrescribimos en el método toString
                }
            }
        }
    
    public void vaciarCarrito(){
        productos.clear();
        System.out.println("Vaciando carrito");
    }
    
    
    
    
}
