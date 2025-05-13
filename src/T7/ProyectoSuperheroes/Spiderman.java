package T7.ProyectoSuperheroes;

public class Spiderman extends SuperHeroe implements LanzarTelaraña, ArtesMarciales{

    public Spiderman(String nombre, String identidadSecreta) {
        super(nombre, identidadSecreta);
    }

    public Spiderman(){
    }

    @Override
    void usarPoder() {
        System.out.println("Detengo a los malos con mi telaraña");
    }





    @Override
    public void colgarCamara() {
        System.out.println("PATATAAA");
    }

    @Override
    public void lanzarTelarnya() {
        System.out.println("Lanzo telaraña y te atrapo");
    }

    @Override
    public void volarEntreEdificios() {
        System.out.println("Con mi telaraña vuelo!");
    }

    @Override
    public void darPuñetazo() {
        System.out.println("Te doy en el pecho");
    }

    @Override
    public void hacerPatada() {

    }

    @Override
    public void pelear() {

    }
}
