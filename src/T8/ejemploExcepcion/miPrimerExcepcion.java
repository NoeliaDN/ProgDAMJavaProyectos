package T8.ejemploExcepcion;

import javax.swing.*;

public class miPrimerExcepcion {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Ingrese el valor");

        try {
            int divisor = Integer.parseInt(userInput);//convierte u String en entero para controla el tipo que queremos recibir
            //hay que hacerlo dentro del try, porque si no no lo controla y lanza la excepcion, sino que finaliza el programa de forma abrupta
                        
            int resultado = 10/divisor;
            System.out.println(resultado);
        } catch (ArithmeticException ae) {
            //throw new RuntimeException(e);
                        //System.out.println("Error diviendo por cero: " +e.getMessage()); //controlamos la excepcion y mostramos el error con u mensaje

                        System.out.println("Error diviendo por cero");
                        main(args); //para volver a empezar (no recomendable)
        } catch (NumberFormatException nfe) {
            System.out.println("Error no has introducido un entero");
        }
        finally{
        JOptionPane.showMessageDialog(null, "EL PROGRAMA ESTÁ EN EL FINALLY");//como vemos, este bloque se ejecuta siempre
        }
        
        JOptionPane.showMessageDialog(null, "EL PROGRAMA FINALIZADO");



    }
}
