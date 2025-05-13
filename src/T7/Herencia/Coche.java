/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7.Herencia;

/**
 *
 * @author Noelia
 */
public class Coche extends Vehiculo {
    
    private int numPuertas;
    
    
    public void mostrarInfo(){
        System.out.println("Marca: " +super.getMarca() + " , Número de puertas: " + numPuertas);
    }
    
}
