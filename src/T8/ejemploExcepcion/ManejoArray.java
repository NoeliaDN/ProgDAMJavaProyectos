package T8.ejemploExcepcion;
/// •	1. Crea un programa en Java que capture una excepción al
/// intentar acceder a un índice inválido de un array.

public class ManejoArray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; // Array de 5 elementos

        try {
            // Intentamos acceder a un índice fuera del rango
            System.out.println("El número en la posición 10 es: " + numeros[10]);
            
            //podemos controlar el error de oue of bounds:
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intentaste acceder a un índice fuera de los límites del array.");
        }
        //o el normal, que lo recoge todo:
        
        catch (Exception e){
            System.out.println("Cualquier error" + e.getMessage());
        }

       System.out.println("Fin del programa.");
    } 
        
}
