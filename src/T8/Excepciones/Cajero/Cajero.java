package T8.Excepciones.Cajero;

public class Cajero {
    public static void main(String[] args) {
        double saldo = 100.0;

        try {
            retirarDinero(saldo, -50); // Intentamos retirar monto negativo
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Monto inválido. " + e.getMessage());
        }
    }
    //throws SaldoInsuficienteException: declaramos solo la personalizada porque IllegalArgumentException
    // es unchecked (no necesita declararse).
    public static void retirarDinero(double saldo, double monto) throws SaldoInsuficienteException {
        if (monto < 0) {
            throw new IllegalArgumentException("No puedes retirar un monto negativo.");
        }
        if (monto > saldo) {
            throw new SaldoInsuficienteException("No tienes suficiente saldo para retirar $" + monto);
        }
        System.out.println("Has retirado $" + monto + ". Saldo restante: $" + (saldo - monto));
    }
}
