package T6.Listas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Comparacion {
   public static void main(String[] args) {

       int cantidadElementos = 100000;
       int posicionInsercion = 50000;

       //LLENAMOS ARRAYLIST
       ArrayList<Integer> arraylist = new ArrayList<>();
       for (int i = 0; i < cantidadElementos; i++){
           arraylist.add(i);
       }

       //LLENAMOS LINKEDLIST
       LinkedList<Integer> linkedlist = new LinkedList<>();
       for (int i = 0; i < posicionInsercion; i++){
           linkedlist.add(i);
       }

       long inicioArraylist = System.nanoTime();// nanoTime()marca un temporizador
       arraylist.add(posicionInsercion, -1);
       long finArraylist = System.nanoTime();
       finArraylist = finArraylist - inicioArraylist;

       long inicioLista = System.nanoTime();
       linkedlist.add(posicionInsercion, -1);
       long finLista = System.nanoTime();
       finLista = finLista - inicioLista;

       //MEDIR EL TIEMPO CON LISTITERATOR PARA INSERCIÓN:
       ListIterator<Integer> listIterator = linkedlist.listIterator(posicionInsercion);
       
       long inicio = System.nanoTime();
       listIterator.add(-1);//le pedimos que iserte la posición donde est´apuntando el elemento -1.
       long fin = System.nanoTime();
       fin= fin-inicio;
       
       //Mostrar resultados
       System.out.println("Tiempo de inserción en ArrayList: " + finArraylist);
       System.out.println("Tiempo de inserción en LinkedList: " + finLista);
       System.out.println("Tiempo de inserción en LinkedList: " + fin);



   }





}
