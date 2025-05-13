package T8.JuegoZombies;

import java.util.Random;

public class Zombie {
    private String nombre;
    private int vidas;
    private boolean vivo;

    public Zombie(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas=vidas;
        this.vivo = true;
    }

    public void recibirDano() throws ZombieMuertoException {
        Random r = new Random();
        if (!vivo) { throw new ZombieMuertoException("Has fallado, el zombie " + this.nombre + " ya está muerto");
        }
        int dano = r.nextInt(11); //0 a 10
        vidas -= dano;
        System.out.println("Has hecho:  " + dano + " de daño al Zombie " + this.nombre);
        if (vidas <= 0) {
            vivo = false;
            System.err.println("Has eliminado al Zombie " + this.nombre);
        }
    }
    public boolean estavivo() {
        return vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public boolean isVivo() {
        return vivo;
    }
}
