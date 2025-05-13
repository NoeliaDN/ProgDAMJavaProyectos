package T7.ProyectoSuperheroes;

/**
 * Clase abstracta que representa a un superhéroe
 * Define atributos comunes a todos los superhéroes
 *
 */
 abstract public class SuperHeroe {
    protected String nombre;
    private String identidadSecreta;

    /**
     * Constructor de la clase superhéroe
     * @param nombre del superhéroe
     * @param identidadSecreta
     */
    public SuperHeroe(String nombre, String identidadSecreta) {
        this.nombre = nombre;
        this.identidadSecreta = identidadSecreta;
    }
    public SuperHeroe() {}

    /**
     * Método que presenta al superhéroe mostrando su nombre e indentad
     */
    public void presentarse() {
        System.out.println("Soy: " + nombre + " y mi identidad Secreta es: " + identidadSecreta);
    }

    /**
     * Método abstracto que cada superhéroe implementará de una manera distinta.
     */
    abstract void usarPoder();// no se ponen las llaves porque si no lo implementamos y no se puede, es abstracto.
 }
