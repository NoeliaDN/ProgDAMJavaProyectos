/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T5.ProyectoMascotaVirtual;

/**
 *
 * @author Noelia
 */
public class Gato extends Animal{
    //como desciende de animal, ya tiene nombre y edad. Ahora le podemos añadir otros atributos
    
    String estadoAnimo;
    
    
    public Gato(String nombre, int edad, String estadoAnimo){
        super(nombre, edad);//SUPER para referirnos a la clase padre
        this.estadoAnimo= estadoAnimo;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("RRRRRRRR");        
    }
    
    public void maullar(){
        System.out.println("Miauuuuuuu");
    }
    
    
}
