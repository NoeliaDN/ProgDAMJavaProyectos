package T8.Excepciones.Calculadora;

import javax.swing.*;

public class mainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor"));
        //PRIMERO AQUÍ PARA VER EL ERROR.LUEGOPASARLA AL TRY
        //double division = calculadora.dividir(10,divisor);
        double division;


        try {
        //    int division = 10 / divisor;
            division = calculadora.dividir(10,divisor);
            System.out.println("Division: " + division);
        } catch (DivisionPorCeroException ae) {
            System.out.println("Capturamos la excepción en tiempo de ejecución. El error es: " + ae.getMessage());
            //despues de probarlo. Incluso podemos llamar al main otra vez.
            main(args);
        } catch (NumberFormatException nfe) {
            System.out.println("Se ha producido un error en el valor. El error es: " + nfe.getMessage());
            //despues de probarlo. Incluso podemos llamar al main otra vez.
            main(args);
        } finally {
            System.out.println("Finally opcional. Pero se ejecuta siempre");
        }
        //Ahora podemos seguir con la ejecución
        System.out.println("CONTINUAMOS");

    }
}
