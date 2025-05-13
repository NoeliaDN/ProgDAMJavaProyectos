package T8.Excepciones.EdadNoValida;

public class Club {
    public static void main(String[] args) {
        int edad = 16; // Edad simulada

        try {
            comprobarEdad(edad);//como hereda de Exception, no podemos usar este método sin no está en un try-catch
            System.out.println("¡Bienvenido al club!");
        } catch (EdadNoValidaException e) {
            System.out.println("Acceso denegado: " + e.getMessage());
        }
    }

    public static void comprobarEdad(int edad) throws EdadNoValidaException {
        if (edad < 18) {
            throw new EdadNoValidaException("Debes tener al menos 18 años para entrar.");
        }
        else{
            System.out.println("Eres mayor de edad. Puedes jugar.");
        }
    }
}