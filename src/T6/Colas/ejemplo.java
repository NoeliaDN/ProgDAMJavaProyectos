package T6.Colas;
import java.util.*;
//FIFO - PRIMERO EN ENTRAR - PRIMERO EN SALIR
public class ejemplo {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();// porque es un tipo especial de LinkedList
        Queue<Integer> posicionInsercion = new ArrayDeque<>(5);//para limitar el tamaño de la cola podemos usar ArrayDeQue
        cola.offer("Juan");
        cola.offer("Maria");
        cola.offer("Jose");

        System.out.println(cola);
        System.out.println(cola.poll());
        //null si la cola esta vacia
        System.out.println(cola);

        System.out.println(cola.peek());
        System.out.println(cola);

        for (String elemento: cola) {
            System.out.println(elemento);
        }


    }



}
