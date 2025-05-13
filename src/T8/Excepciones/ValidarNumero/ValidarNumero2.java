package T8.Excepciones.ValidarNumero;
import java.util.Scanner;

public class ValidarNumero2 {
    public class ValidarNumero {
        // Método que lanza la excepción si el número es negativo
        public static void verificarNumero(int numero) throws NumeroNegativoException {//throws si va en el nombre del método y throw si está dentro del bloque
            if (numero < 0) {
                throw new NumeroNegativoException("¡No se permiten números negativos: " + numero + "!");
            }
            System.out.println("Número válido: " + numero);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Ingrese un número entero: ");
                int numero = scanner.nextInt();

                // Verificamos el número usando nuestra excepción personalizada
                verificarNumero(numero);
            } catch (NumeroNegativoException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            } finally {
                System.out.println("Fin del programa.");
                scanner.close();
            }
        }
    }
}
