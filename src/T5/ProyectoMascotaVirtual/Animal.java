/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T5.ProyectoMascotaVirtual;

/**
 *
 * @author Noelia
 */
public abstract class Animal {//con cosas que serán comunes a todos los animales.
    //NO SE PUEDE INSTANCIAR
    
    //ATRIBUTOS
    protected String nombre; // usamos PROTECTED para poder usarlos dentro del mismo paquete
    protected int edad;
    
    //CONSTRUCTOR
    
    public Animal(String nombre, int edad){
        this.nombre= nombre;
        this.edad= edad;
    }
    
    
    //MÉTODOS
    public void hacerSonido(){
        System.out.println("GRRRRR");
    }
}
