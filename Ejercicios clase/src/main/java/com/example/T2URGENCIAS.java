package com.example;

import java.util.Scanner; //para usar el scanner

public class T2URGENCIAS {

    public static final int NUSS_MIN = 100000, NUSS_MAX = 999999;
    public static final int TEMPERATURA_MIN = 27, TEMPERATURA_MAX = 45;
    public static final int PRIORIDAD_MIN = 0, PRIORIDAD_MAX = 5;
    public static final int SINTOMA_MIN = 0, SINTOMA_MAX = 3;
    public static final int EXPLORACION_MIN = 0, EXPLORACION_MAX = 3; // realmente podría reutilizar el de los síntomas,
                                                                      // pero bueno, así está todo más claro

    public static void main(String[] args) {

        // BLOQUE DECLARACION DE VARIABLES

        Scanner sc = new Scanner(System.in); // para usar el scanner

        int nuss = 0, sintoma = 0, exploracion = 0, prioridad = 0, temperatura = 0;

        boolean correcto = false; // "semáforo"

        // PEDIR DATOS DE UN PACIENTE:

        // pedir datos del paciente

        // número de la SS

        System.out.println("Introduce el NUSS: ");

        do {

            // Antes de comprobar el rango, queremos comprobar si es del tipo deseado cvon
            // hasNext():
            if (sc.hasNextInt()) {
                nuss = sc.nextInt(); // guardamos el entero en la variable nuss, después de comprobar que es un
                                     // entero

                if ((nuss >= NUSS_MIN) && (nuss <= NUSS_MAX)) { // comprobamos que el nuss es correcto
                    correcto = true;
                    System.out.println("NUSS correcto: " + nuss); // si es correcto lo mostramos por pantalla
                } else {
                    correcto = false;

                    System.out.println("Error de rango."); // si no es correcto lo mostramos por pantalla
                    System.out.println("Valores válidos:" + NUSS_MIN + " - " + NUSS_MAX + ". Inténtelo de nuevo. "); // mostramos
                                                                                                                     // el
                                                                                                                     // rango

                }
            } else {
                correcto = false;

                System.out.println("Error de tipo. Introduzca un número entero."); // si no es correcto lo mostramos por

                sc.next(); // limpiamos el buffer
            }
        }

        while (!correcto); // mientras el nuss no sea correcto pedimos otro nuss

        // PEDIMOS TEMPRATURA :
        do {
            System.out.println("\nIntroduce la temperatura: ");
            System.out.println("Valores válidos: " + TEMPERATURA_MIN + " - " + TEMPERATURA_MAX + ".");
            if (sc.hasNextInt()) {
                temperatura = sc.nextInt();

                if ((temperatura >= TEMPERATURA_MIN) && (temperatura <= TEMPERATURA_MAX)) {
                    correcto = true;
                    System.out.println("Temperatura introducida: " + temperatura); // si es correcto lo mostramos por
                                                                                   // pantalla
                } else {
                    correcto = false;
                    System.out.println("Error de rango."); // si no es correcto lo mostramos por pantalla
                    System.out.println(
                            "Valores válidos:" + TEMPERATURA_MIN + " - " + TEMPERATURA_MAX + ". Inténtelo de nuevo. "); // mostramos
                                                                                                                        // el
                                                                                                                        // rango
                }

            } else {
                sc.next(); // limpiamos el buffer
                correcto = false;
            }
        } while (!correcto);

        // PEDIMOS NIVEL DE PRIORIDAD:
        do {
            System.out.println("\nDime el nivel de prioridad: ");
            System.out.println("Valores válidos: " + PRIORIDAD_MIN + " - " + PRIORIDAD_MAX + ".");
            if (sc.hasNextInt()) {
                prioridad = sc.nextInt();

                if ((prioridad >= PRIORIDAD_MIN) && (prioridad <= PRIORIDAD_MAX)) {
                    correcto = true;
                    System.out.println("Prioridad introducida: " + prioridad); // si es correcto lo mostramos por
                                                                               // pantalla
                } else {
                    correcto = false;
                    System.out.println("Error de rango."); // si no es correcto lo mostramos por pantalla
                    System.out.println(
                            "Valores válidos:" + PRIORIDAD_MIN + " - " + PRIORIDAD_MAX + ". Inténtelo de nuevo. "); // mostramos
                                                                                                                    // el
                                                                                                                    // rango
                }

            } else {
                sc.next(); // limpiamos el buffer
                correcto = false;
            }
        } while (!correcto);

        // PEDIR SÍNTOMAS:
        System.out.println("\nINTRODUCE EL SÍNTOMA: ");
        System.out.println(
                "\t1. Dolor (0)\n\t2. Lesión traumática (1)\n\t3. Fiebre alta (2)\n\t4. Confusión o desorientación (3)");

        do {
            if (sc.hasNextInt()) {
                sintoma = sc.nextInt();

                if ((sintoma >= SINTOMA_MIN) && (sintoma <= SINTOMA_MAX)) {
                    correcto = true;
                    System.out.println("Síntoma introducido: " + sintoma); // si es correcto lo mostramos por pantalla
                } else {
                    correcto = false;
                    System.out.println("Error de rango."); // si no es correcto lo mostramos por pantalla
                    System.out
                            .println("Valores válidos:" + SINTOMA_MIN + " - " + SINTOMA_MAX + ". Inténtelo de nuevo. "); // mostramos
                                                                                                                         // el
                                                                                                                         // rango
                }

            } else {

                correcto = false;

                System.out.println("Error de tipo. Introduzca un número entero."); // si no es correcto lo mostramos por
                sc.next(); // limpiamos el buffer
            }
        } while (!correcto);

        // Según síntoma, pedimos exploración:
        do {
            switch (sintoma) {
                case 0:
                    System.out.println(
                            "\nDOLOR. ¿Exploración?\n\t1. Dolor torácico (0)\n\t2. Dolor abdominal (1)\n\t3. Dolor de cabeza (2)\n\t4. Migraña (3)");
                    if (sc.hasNextInt()) {
                        exploracion = sc.nextInt();

                        if ((exploracion >= EXPLORACION_MIN) && (exploracion <= EXPLORACION_MAX)) {
                            correcto = true;
                            System.out.println("Exploración introducida correctamente: Exploración " + exploracion);
                        } else {
                            correcto = false;
                            System.out.println("Error de rango.");
                            System.out.println(
                                    "Valores válidos:" + SINTOMA_MIN + " - " + SINTOMA_MAX + ". Inténtelo de nuevo. ");
                        }

                    } else {

                        correcto = false;

                        System.out.println("Error de tipo. Introduzca un número entero."); // si no es correcto lo
                                                                                           // mostramos por
                        sc.next(); // limpiamos el buffer
                    }

                    break;
                case 1:
                    System.out.println(
                            "\nLESIÓN TRAUMÁTICA. ¿Exploración?\n\t1. Fractura ósea (0)\n\t2. Herida de bala (1)\n\t3. Quemadura (2)\n\t4. Lesión cerebral traumática (3)");

                    if (sc.hasNextInt()) {
                        exploracion = sc.nextInt();

                        if ((exploracion >= EXPLORACION_MIN) && (exploracion <= EXPLORACION_MAX)) {
                            correcto = true;
                            System.out.println("Exploración introducida correctamente: Exploración " + exploracion);
                        } else {
                            correcto = false;
                            System.out.println("Error de rango.");
                            System.out.println(
                                    "Valores válidos:" + SINTOMA_MIN + " - " + SINTOMA_MAX + ". Inténtelo de nuevo. ");
                        }

                    } else {

                        correcto = false;

                        System.out.println("Error de tipo. Introduzca un número entero."); // si no es correcto lo
                                                                                           // mostramos por
                        sc.next(); // limpiamos el buffer
                    }
                    break;
                case 2:
                    System.out.println(
                            "\nFIEBRE ALTA. ¿Exploración?\n\t1. Neumonía (0)\n\t2. Meningitis (1)\n\t3. Infección viral (2)\n\t4. Reacción alérgica (3)");

                    if (sc.hasNextInt()) {
                        exploracion = sc.nextInt();

                        if ((exploracion >= EXPLORACION_MIN) && (exploracion <= EXPLORACION_MAX)) {
                            correcto = true;
                            System.out.println("Exploración introducida correctamente: Exploración " + exploracion);
                        } else {
                            correcto = false;
                            System.out.println("Error de rango.");
                            System.out.println(
                                    "Valores válidos:" + SINTOMA_MIN + " - " + SINTOMA_MAX + ". Inténtelo de nuevo. ");
                        }

                    } else {

                        correcto = false;

                        System.out.println("Error de tipo. Introduzca un número entero."); // si no es correcto lo
                                                                                           // mostramos por
                        sc.next(); // limpiamos el buffer
                    }

                    break;
                case 3:
                    System.out.println(
                            "\nCONFUSIÓN ODESORIENTACIÓN. ¿Exploración?\n\t1. Intoxicación por drogas o alcohol (0)\n\t2. Deshidratación severa (1)\n\t3. accidente cerebrovascular (2)\n\t4. Hipoglucemia severa (3)");

                    if (sc.hasNextInt()) {
                        exploracion = sc.nextInt();

                        if ((exploracion >= EXPLORACION_MIN) && (exploracion <= EXPLORACION_MAX)) {
                            correcto = true;
                            System.out.println("Exploración introducida correctamente: Exploración " + exploracion);
                        } else {
                            correcto = false;
                            System.out.println("Error de rango.");
                            System.out.println(
                                    "Valores válidos:" + SINTOMA_MIN + " - " + SINTOMA_MAX + ". Inténtelo de nuevo. ");
                        }

                    } else {

                        correcto = false;

                        System.out.println("Error de tipo. Introduzca un número entero.");
                        sc.next(); // limpiamos el buffer

                    }

                    break;

                default:
                    correcto = false;
                    System.out.println("Error de tipo. Introduzca un número entero.");
                    break;
            }
        }

        // el profesor ha puesto la comprobación del rango de exploración aquí, ya que
        // el rango de exploración siempre es el mismo. Yo prefiero ponerlo así por si
        // en algún momento se cambia el rango de exploración.

        while (!correcto);

        // pedimos nivel prioridad

        // MOSTRAR UN RESUMEN
        System.out.println("\nRESUMEN DE LOS DATOS DEL PACIENTE: ");
        System.out.println("\tNUSS: " + nuss);
        System.out.println("\tTemperatura: " + temperatura);
        System.out.println("\tPrioridad: " + prioridad);

        switch (sintoma) {
            case 0:
                System.out.println("\n\tSíntoma: Dolor");
                switch (exploracion) {
                    case 0:
                        System.out.println("\tExploración: Dolor torácico");
                        break;
                    case 1:
                        System.out.println("\tExploración: Dolor abdominal");
                        break;
                    case 2:
                        System.out.println("\tExploración: Dolor de cabeza");
                        break;
                    case 3:
                        System.out.println("\tExploración: Migraña");
                        break;
                }
                break;
            case 1:
                System.out.println("\n\tSíntoma: Lesión traumática");
                switch (exploracion) {
                    case 0:
                        System.out.println("\tExploración: Fractura ósea");
                        break;
                    case 1:
                        System.out.println("\tExploración: Herida de bala");
                        break;
                    case 2:
                        System.out.println("\tExploración: Quemadura");
                        break;
                    case 3:
                        System.out.println("\tExploración: Lesión cerebral traumática");
                        break;
                }
                break;
            case 2:
                System.out.println("\n\tSíntoma: Fiebre alta");
                switch (exploracion) {
                    case 0:
                        System.out.println("\tExploración: Neumonía");
                        break;
                    case 1:
                        System.out.println("\tExploración: Meningitis");
                        break;
                    case 2:
                        System.out.println("\tExploración: Infección viral");
                        break;
                    case 3:
                        System.out.println("\tExploración: Reacción alérgica");
                        break;
                }
                break;
            case 3:
                System.out.println("\n\tSíntoma: Confusión o desorientación");
                switch (exploracion) {
                    case 0:
                        System.out.println("\tExploración: Intoxicación por drogas o alcohol");
                        break;
                    case 1:
                        System.out.println("\tExploración: Deshidratación severa");
                        break;
                    case 2:
                        System.out.println("\tExploración: Accidente cerebrovascular");
                        break;
                    case 3:
                        System.out.println("\tExploración: Hipoglucemia severa");
                        break;
                }
                break;
        }

        //System.out.println("\tSíntoma: " + sintoma);
        //System.out.println("\tExploración: " + exploracion);

    }

}