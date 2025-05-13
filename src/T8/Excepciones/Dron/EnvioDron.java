package T8.Excepciones.Dron;
// Tenemos un sistema que envía paquetes por dron:

// Si el peso del paquete supera el límite → lanzamos PaqueteDemasiadoPesadoException (personalizada).
// Si el destino está fuera del área de cobertura → lanzamos DestinoInvalidoException (también personalizada).
public class EnvioDron {
    public static void main(String[] args) {
        double peso = 8.0; // kg
        String destino = "Campo";
        int bateria = 25; // %

        try {
            enviarPaquete(peso, destino, bateria);
            System.out.println("Paquete enviado con éxito.");
        } catch (PaqueteDemasiadoPesadoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DestinoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (BateriaBajaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    //Las dos excepciones son checked, por lo que:
    //Se declaran con throws en el método.
    //El compilador obliga a capturarlas con try-catch.
    public static void enviarPaquete(double peso, String destino, int bateria)
            throws PaqueteDemasiadoPesadoException, DestinoInvalidoException, BateriaBajaException {

        if (peso > 10.0) {
            throw new PaqueteDemasiadoPesadoException("El paquete pesa " + peso + " kg. Máximo permitido: 10 kg.");
        }

        if (!destino.equalsIgnoreCase("Ciudad") && !destino.equalsIgnoreCase("Campo")) {
            throw new DestinoInvalidoException("Destino '" + destino + "' fuera del área de entrega.");
        }

        if (bateria < 30) {
            throw new BateriaBajaException("Batería al " + bateria + "%. Mínimo requerido: 30%.");
        }

        System.out.println("Enviando paquete de " + peso + " kg a " + destino + " con batería al " + bateria + "%...");
    }
}
