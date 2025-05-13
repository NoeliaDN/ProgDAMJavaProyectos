package T7.ProyectoVueltaCiclista;

public class CorredorJuvenil extends Profesional{
    String categoriaEdad;
    public CorredorJuvenil(String nombre, int edad, String ciudad, double tiempoCarrera, String patrocinador, String categoriaEdad) {
        super(nombre, edad, ciudad, tiempoCarrera, patrocinador);
        this.categoriaEdad = categoriaEdad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre " + nombre + "| Edad + " + edad);
        System.out.println("Categoria JUVENIL | Rango edad " + categoriaEdad);
        mostrarPatrocinador();
    }
}
