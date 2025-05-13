/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T4.matematicas;

/**
 *
 * @author Noelia
 */
public class Factorial 
    { 
// Esto es un método recursivo 
        public int facR (int n){ 
            int resultado;
        if (n==1) return 1; 
        resultado=facR(n-1)*n; 
        return resultado; } 
    
// Esto es un equivalente iterativo 
    public int facI (int n){ 
        int t, resultado; 
        resultado=1; 
        for (t=1; t<=n; t++) resultado *=t; 
        return resultado; 
    } 
}
