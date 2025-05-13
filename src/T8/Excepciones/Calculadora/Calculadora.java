package T8.Excepciones.Calculadora;

public class Calculadora {

    public double dividir ( int numerador, int denominador) throws DivisionPorCeroException {
        if(denominador == 0) {
            throw new ArithmeticException("no se puede dividir por cero!");
        }
        return (double) numerador/denominador;
    }
}
