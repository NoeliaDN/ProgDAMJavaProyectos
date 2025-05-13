package T7.ProyectoVueltaCiclista;

public class CorredorPopular extends Corredor {


    public CorredorPopular(String nombre, int edad, String ciudad, double tiempoCarrera) {
        super(nombre,edad, ciudad, tiempoCarrera);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Ciudad: " + ciudad + " | Tiempo de Carrera: " + tiempoCarrera) ;
        System.out.println("Corro por afición :-)");
    }
}
