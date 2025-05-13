package T8.Excepciones.EdadNoValida;

public class EdadNoValidaException extends Exception {
    public EdadNoValidaException(String mensaje) {
        super(mensaje); // Llama al constructor de la clase Exception
    }
}
