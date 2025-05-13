package T8.Excepciones.Calculadora;

public class DivisionPorCeroException extends Exception {
    //si fuese runeneable no seria chequeada

    public DivisionPorCeroException(String msg) {
        super(msg);
    }

}
