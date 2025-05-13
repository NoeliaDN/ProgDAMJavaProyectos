/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T4.matematicas;

/**
 *
 * @author Noelia
 */
public class Geometria {
     /** * Calcula el volumen de un cilindro. 
     * Tanto el radio como la altura se deben proporcionar en las 
     * mismas unidades para que el resultado sea congruente. * 
     * @param r radio del cilindro 
     * @param h altura del cilindro 
     * @return volumen del cilindro */ 
    public static double volumenCilindro(double r, double h) 
    { 
        return Math.PI * r * r * h; 
    } 
    /** * Calcula la longitud de una circunferencia a partir del radio. * 
     * @param r radio de la circunferencia 
     * @return longitud de la circunferencia 
     */ 
    public static double longitudCircunferencia(double r) 
    { 
        return 2 * Math.PI * r; 
    }
    
    public static int potencia (int x, int y){
        int resultado = x;
        
        for (int i=1; i<y; i++){
            resultado=resultado*x;
        }
        return resultado;
    }
    
    public static int potenciaRecursiva(int x, int y){
        //marcamos el punto donde queremos que empiece y acabe:
        
        if(y==0){
            return 1;
            
        }
        return x*potenciaRecursiva(x, y-1);
        
    }
    
}
    
    
    
    
    

