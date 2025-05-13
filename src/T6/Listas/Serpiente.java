package T6.Listas;
import java.util.Scanner;
import java.util.LinkedList;

public class Serpiente {
    public static void main(String[] args) {
        LinkedList<String> snake = new LinkedList<>();
        snake.add("0");
        snake.add("0");
        snake.add("0");

        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n JUEGO DE LA SERPIENTE: ");
            System.out.println("\n 1. Comer comida (+1 segmente)");
            System.out.println("\n 2. Moverse (quitar cola y agregar cabeza)");
            System.out.println("\n 3. Choca y termina el juego");
            System.out.println("\n 4. Salir");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    snake.addFirst("0");//añadimos al principio
                    System.out.println("La serpiente ha crecido");
                    System.out.println(snake);
                    break;
                case "2":
                    snake.removeFirst();//quitamos el primer elemento
                    snake.addLast("0");//añadimos al final
                    System.out.println("La serpiente se ha movido");
                    break;
                case "3":
                    System.out.println("CHOQUE. Fin del juego");
                    break;
                case "4":
                    System.out.println("Salir");
                    break;
                default:
                        System.out.println("Opcion no valida");

            }
        } while(!opcion.equals("4"));

    }
}
