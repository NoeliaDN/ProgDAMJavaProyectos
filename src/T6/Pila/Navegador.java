package T6.Pila;

import java.util.Stack;
public class Navegador {

    protected Stack <String> historialAtras;
    protected Stack <String> historialAdelante;
    protected String paginaActual;
    public Navegador() {
        historialAtras = new Stack<>();
        historialAdelante = new Stack<>();
        paginaActual = "https://web2.alexiaedu.com";
    }

    public void visitarPagina (String url) {
        if (paginaActual != null) {
            historialAtras.push(paginaActual);
        }
        paginaActual = url;
        historialAdelante.clear();
        System.out.println("Visitando pagina " + paginaActual);
    }
    public void irAtras() {
        if (!historialAtras.isEmpty()) {
            historialAdelante.push(paginaActual);
            paginaActual = historialAtras.pop();
            System.out.println("Volvemos a la pagina " + paginaActual);
        } else {
            System.out.println("Me quedo igual. No hay más páginas");
        }
    }
    public void irAdelante(){
        if (!historialAdelante.isEmpty()) {
            historialAtras.push(paginaActual);
            paginaActual = historialAdelante.pop();
            System.out.println("Avanzando a  " + paginaActual);
        } else {
            System.out.println("No hay páginas");
        }
    }

    public void mostrarEstado() {
        System.out.println("Página actual: " + paginaActual);
        System.out.println("Historial Atras: " + historialAtras);
        System.out.println("Historial Adelante: " + historialAdelante);
    }
}
