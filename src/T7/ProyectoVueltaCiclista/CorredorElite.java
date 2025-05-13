package T7.ProyectoVueltaCiclista;

public class CorredorElite extends Profesional {
    public CorredorElite(String nombre, int edad, String ciudad, double tiempoCarrera, String patrocinador){
        super(nombre, edad, ciudad, tiempoCarrera, patrocinador);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }

    public void premidoGanado(double premio) {
        System.out.println("He ganado un premio de " + premio);
    }
}
