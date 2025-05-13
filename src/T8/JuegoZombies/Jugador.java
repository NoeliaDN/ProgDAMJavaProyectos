package T8.JuegoZombies;
import java.util.Random;

public class Jugador {
    private int vidas;

    public Jugador() {
        this.vidas = 10;
    }

    public void recibirAtaque() throws SinVidasException {
        Random r = new Random();
        int dano = r.nextInt(5); //0 a 4
        this.vidas -= dano;
        System.out.println("Te ha atacado un zombie. Te ha quitado " + dano + "vidas.");
        if (this.vidas <= 0) {
            throw new SinVidasException("Has perdido todas tus vidas! + GAME OVER");
        }
    }

    public boolean estaVivo() {

        return vidas > 0;
    }

    public int getVidas() {
        return vidas;
    }

}
