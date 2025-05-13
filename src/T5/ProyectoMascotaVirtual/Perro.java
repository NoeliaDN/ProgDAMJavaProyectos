/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T5.ProyectoMascotaVirtual;

/**
 *
 * @author Noelia
 */
public class Perro extends Animal{
    
    //ATRIBUTOS / CAMPOS
    //(los ponemos private)
    //private String nombre; --> los quitamos prque ahora heredan de la clase Animal
    //private int edad;
    private int nivelEnergia;
    private int nivelHambre;
    private String estadoAnimo;
    
    //Variables de clase
    //public static int numPatas = 4; //con STATIC es una variable de clase, es decir, que es común a todos lo perros ( a todos los objetos de esa clase). No es constante, se puede modificar.
    public static int numPerros = 0;
    
    //Constantes
    private static final int ENERGIAMAX = 100; //esta sí es una constante, como siempre, con mayúsculas y "final"
    //private static final int HAMBREMAX = 100; 
    private static final int HAMBREMIN = 0; 
    private static final String FELIZ = "Feliz"; 
    
    //CONSTRUCTORES
    
    //(POLIMORFISMO)
    public Perro(String nombre, int edad, int nivelEnergia, int nivelHambre, String estadoAnimo){
        
        super(nombre, edad);//coge los atributos de la clase padre con SUPER
        this.edad= edad;
        this.nivelEnergia= nivelEnergia;
        this.nivelHambre= nivelHambre;
        this.estadoAnimo= estadoAnimo;
        
    }
    
    public Perro(){//si se crea el pero sinparámatros, se crea así por defecto
        super("No tengo nombre", 0);
        this.edad= 0;
        this.nivelEnergia= ENERGIAMAX;
        this.nivelHambre= HAMBREMIN;
        this.estadoAnimo= FELIZ;
}
    public Perro(String nombre){ //si sólo se proporciona el nombre, se crea con estos datos por defecto
        super(nombre, 0);
        this.nivelEnergia= ENERGIAMAX;
        this.nivelHambre= HAMBREMIN;
        this.estadoAnimo= FELIZ;
    }
    
    
    //Métodos 
    
    
    //getters y setters)
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad= edad;
    }
    
    public int getNivelEnergia(){
        return nivelEnergia;
    }
    
    public void setNivelEnergia(int nivelEnergia){
        this.nivelEnergia= nivelEnergia;
    }
    
    public int getNivelHambre(){
        return nivelHambre;
    }
    
    public void setNivelHambre(int nivelHambre){
        this.nivelHambre= nivelHambre;
    }
    
    public String getEstadoAnimo(){
        return estadoAnimo;
    }
    
    public void setEstadoAnimo(String estadoAnimo){
        this.estadoAnimo= estadoAnimo;
    }
    
    //resto de métodos:
    
    public void comer(){
        this.nivelHambre--;
    }
    
    public void comer(int cantidad){
        this.nivelHambre=this.nivelHambre-cantidad;
    }
    public void jugar(){
        System.out.println("Qué bien me siento");
        this.nivelHambre++;
        this.nivelEnergia--;
    }
    
    public void dormir(){
        System.out.println("ZZZZZZZZZZ");
        this.nivelEnergia++;
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Edad: "+ this.edad);
        System.out.println("Energía: "+ this.nivelEnergia);
        System.out.println("Hambre: "+ this.nivelHambre);
        System.out.println("Estado de ánimo: "+ this.estadoAnimo);

    }
    
}
