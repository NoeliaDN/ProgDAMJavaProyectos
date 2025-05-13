package T8.JuegoZombies;
import java.util.*;

public class Juego {
    private ArrayList <Zombie> horda;
    private Jugador jugador;

    public Juego() {
        jugador = new Jugador();
        horda = new ArrayList<>();
        generarZombies();
    }

    public void generarZombies() {
        Random r = new Random();
        String nombre;
        Scanner sc = new Scanner(System.in);
        String opcion="0";
        do {
            System.out.println("Dime el nombre del zombie:");
            nombre = sc.next();
            int vidas = r.nextInt(4)+1; //de 1 a 3
            horda.add(new Zombie(nombre, vidas));
            System.out.println("¿Hay más zombies? (S/N)");
            opcion = sc.next();
        } while ( (!opcion.equals("N")) && (!opcion.equals("n")) );
    }

    public void mostrarEstado(){
        System.out.println("\nHorda de Zombies: ");
        for (int i = 0; i < horda.size(); i++) {
            System.out.println("Posicion: "+i + " - " + horda.get(i).getNombre() + " - Vidas: "+horda.get(i).getVidas());
        }
        System.out.println("\nVidas restantes: " + jugador.getVidas());
    }

    private boolean quedanZombies() {
        for (Zombie z : horda) {
            if (z.estavivo()) return true;
        }
        return false;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        Zombie zombie;
        int posicionAtaque;
        System.out.println("Bienvenido al juego Supervivencia ataque Zombies");
        while (jugador.estaVivo() && quedanZombies()) {
            mostrarEstado();
            try {
                System.out.println("Te toca atacar");
                System.out.println("Elige el número de zombie al que atacar");
                posicionAtaque = Integer.parseInt(sc.nextLine());
                if (posicionAtaque<0 || posicionAtaque > horda.size()) {
                    throw new AtaqueInvalidoException("Disparo erróneo. Fuera de rango");
                }
                zombie = horda.get(posicionAtaque);
                zombie.recibirDano();

                System.out.println("Turno del zombie");
                jugador.recibirAtaque();

            } catch (NumberFormatException nfe) {
                System.out.println("Error, introduce un número");
            } catch (AtaqueInvalidoException | ZombieMuertoException aie) {
                System.out.println("Error" + aie.getMessage());
            } catch (SinVidasException sve) {
                System.out.println(sve.getMessage());
            }
        }

        if (jugador.estaVivo()) {
            System.out.println("HAS GANADO. No quedan zombies");
        } else {
            System.out.println("HAS PERDIDO. Has sido devorado por una horda de zombies");
        }
    }


}
