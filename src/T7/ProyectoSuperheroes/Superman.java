package T7.ProyectoSuperheroes;

/**
 * Clase que representa a superman.
 * Hereda de superheroe
 * Implementa la interfaz volar
 */
public class Superman extends SuperHeroe implements Volar {
    String algo;
    int edad;
    public Superman(String nombre, String identidadSecreta){
        super(nombre, identidadSecreta);
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    void usarPoder() {
        System.out.println("Soy superman y vuelo");
    }

    @Override
    public String toString() {
        return (super.nombre);
    }

    @Override
    public void volar() {
        System.out.println("Estoy surcando el cielo");
    }
}
