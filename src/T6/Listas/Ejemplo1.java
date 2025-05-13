package T6.Listas;
import java.util.LinkedList;

public class Ejemplo1 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");


        lista.addFirst("AA");
        lista.addLast("ZZ");

        System.out.println(lista);

        lista.remove();
        System.out.println(lista);

        System.out.println(lista.get(1));
        System.out.println(lista);

    }
}
