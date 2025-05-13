package T7.ProyectoSuperheroes;

/**
 * clase que representa a Batman
 * hereda de superhéroe y implementa Artesmarciales
 */
public class Batman extends SuperHeroe implements ArtesMarciales{
    public Batman(String nombre, String identidadSecreta){
        super(nombre, identidadSecreta);
    }

    @Override
    void usarPoder() {
        System.out.println("Soy Batman y estoy traumatizado, tengo dinero y molo");
    }

    @Override
    public void pelear() {
        System.out.println("Uso mis habilidades para vencer al joker");
    }

    @Override
    public void hacerPatada() {
        System.out.println("Te doy una patada");

    }

    @Override
    public void darPuñetazo() {
        System.out.println("Te doy un puñetazo");
    }
}
