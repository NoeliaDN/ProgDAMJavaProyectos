package T6.Colas;

import javax.management.monitor.StringMonitor;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GestionHospital {

    public static void main(String[] args) {
        Queue<Paciente> listaEspera = new LinkedList<Paciente>();
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n SISTEMA DE GESTIÓN DE PACIENTES DE UN HOSPITAL ===");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Atender paciente");
            System.out.println("3. Ver próximo paciente");
            System.out.println("4. Ver pacientes de la cola");
            System.out.println("5. Salir");
            opcion = sc.nextLine();
            sc.nextLine(); //Limpiar buffer

            switch (opcion) {
                case "1"://AGREGAR PACIENTE
                    System.out.println("Ingrese el nombre del paciente");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el síntoma");
                    String sintoma = sc.nextLine();
                    System.out.println("¿Es una emergencia? (true/false)");
                    boolean esEmergencia = sc.nextBoolean();
                    sc.nextLine();
                    listaEspera.add(new Paciente(nombre, sintoma, esEmergencia));
                    break;
                case "2":
                    if (listaEspera.isEmpty()) {//comprobamos si la lista está vacía
                        System.out.println("no hay pacientes");
                    } else {
                        System.out.println("Atendiendo al paciente: "+listaEspera.poll());//lo sacamos
                    }
                    break;
                case "3":
                    if (listaEspera.isEmpty()) {
                        System.out.println("no hay pacientes");
                    } else {
                        System.out.println("Próximo paciente será: "+listaEspera.peek());
                    }
                    break;
                case "4":
                    if (!listaEspera.isEmpty()) {
                        System.out.println("PACIENTES EN LA LISTA DE ESPERA:");
                        for (Paciente paciente: listaEspera) {
                            System.out.println("Nombre: "+paciente.getNombre());
                            System.out.println("Sintoma: "+paciente.getSintoma());
                            System.out.println("Emergencia: "+paciente.isEsEmergencia());
                        }
                    }
                        break;
                case "5":
                    System.out.println("Saliendo ......");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }



        } while(!opcion.equals("5"));
        sc.close();//es buena práctica siempre cerrar el scanner
        


    }
}
