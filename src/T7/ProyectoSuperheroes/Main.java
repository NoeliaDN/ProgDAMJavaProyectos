package T7.ProyectoSuperheroes;

/**
 * @author
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        
        //Tambiéjn podemos instanciar el array así:
//        SuperHeroe [] heroes = {
//            new Superman("Super Lopez", "Paco Lopez"),
//            new  Batman ("Batman ", "Bruce Wayne"),
//            new Spiderman("Spider", "Peter Parker")
//            
//        }; 
        //pero así no nos deja usar los superpoders que no esten en Superheroe, es decir, no podemos usar los de las clases hijas
                      
        SuperHeroe [] heroes = new SuperHeroe[5];
        Superman a = new Superman("Super Lopez", "Paco Lopez");
        Batman b = new  Batman ("Batman ", "Bruce Wayne");
        Spiderman s = new Spiderman("Spider", "Peter Parker");

        heroes[0] = a;//superman
        heroes[1] = b;//batman
        heroes[2] = s;//spiderman
        heroes[0].usarPoder();
        
        
        if (heroes[0] instanceof Superman) {
            ( (Superman) heroes[0]).volar();//CASTING para poder usar volar()
        } else {
            if (heroes[1] instanceof Spiderman) {// comprobamos que heroes[1] se a una instancia de Spiderman, si no, es Batman y usamos el poder.
                ( (Spiderman) heroes[0]).lanzarTelarnya();
            } else {
                ( (Batman) heroes[0]).usarPoder();
            }

        }
          a.volar();



        a.volar();
        System.out.println(a.toString());


    }
}