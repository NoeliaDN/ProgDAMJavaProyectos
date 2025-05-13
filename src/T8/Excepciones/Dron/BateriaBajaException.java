package T8.Excepciones.Dron;

public class BateriaBajaException extends Exception {
    public BateriaBajaException(String mensaje) {
        super(mensaje);
    }
}
