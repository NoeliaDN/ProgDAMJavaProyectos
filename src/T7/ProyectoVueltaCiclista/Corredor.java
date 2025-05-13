package T7.ProyectoVueltaCiclista;

abstract public class Corredor {
    //ATRIBUTOS
    String nombre;
    int edad;
    String ciudad;
    double tiempoCarrera;


    //CONSTRUCTORES
    public Corredor(String nombre, int edad, String ciudad, Double tiempoCarrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.tiempoCarrera = tiempoCarrera;
    }

    //METODOS
    public abstract void mostrarInformacion();
}
