package com.example;

import java.util.Scanner; //para usar el scanner

public class URGENCIAS {

    public static final int NUSS_MIN = 100000, NUSS_MAX = 999999; 
    public static final int TEMPERATURA_MIN = 27, TEMPERATURA_MAX = 45; 
    public static final int PRIORIDAD_MIN = 0, PRIORIDAD_MAX = 5; 
    public static final int SINTOMA_MIN = 0, SINTOMA_MAX = 3;
    
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
                    System.out.println("Valores válidos:" + NUSS_MIN + " - " + NUSS_MAX + ". Inténtelo de nuevo. "); // mostramos el rango

                }
            } else {
                correcto = false;

                System.out.println("Error de tipo. Introduzca un número entero."); // si no es correcto lo mostramos por


                sc.next(); // limpiamos el buffer
            }
        }

        while (!correcto); // mientras el nuss no sea correcto pedimos otro nuss

     //PEDIMOS TEMPRATURA  :
           do{ 
            System.out.println("\nIntroduce la temperatura: ");
            System.out.println("Valores válidos: "+ TEMPERATURA_MIN +" - " + TEMPERATURA_MAX + ".");
            if(sc.hasNextInt()){
                temperatura = sc.nextInt(); 

                if((temperatura >= TEMPERATURA_MIN) && (temperatura <= TEMPERATURA_MAX)){
                    correcto = true;
                    System.out.println("Temperatura introducida: " + temperatura); // si es correcto lo mostramos por pantalla
                }
                else{
                    correcto = false;
                    System.out.println("Error de rango."); // si no es correcto lo mostramos por pantalla
                    System.out.println("Valores válidos:" + TEMPERATURA_MIN + " - " + TEMPERATURA_MAX + ". Inténtelo de nuevo. "); // mostramos el rango
                }

                
            }
            else{
                sc.next(); // limpiamos el buffer
                correcto = false;
            }
           }
           while(!correcto);

        //PEDIMOS NIVEL DE PRIORIDAD:
        do{ 
            System.out.println("\nDime el nivel de prioridad: ");
            System.out.println("Valores válidos: "+ PRIORIDAD_MIN +" - " + PRIORIDAD_MAX + ".");
            if(sc.hasNextInt()){
                prioridad = sc.nextInt(); 

                if((prioridad >= PRIORIDAD_MIN) && (prioridad <= PRIORIDAD_MAX)){
                    correcto = true;
                    System.out.println("Prioridad introducida: " + prioridad); // si es correcto lo mostramos por pantalla
                }
                else{
                    correcto = false;
                    System.out.println("Error de rango."); // si no es correcto lo mostramos por pantalla
                    System.out.println("Valores válidos:" + PRIORIDAD_MIN + " - " + PRIORIDAD_MAX + ". Inténtelo de nuevo. "); // mostramos el rango
                }

                
            }
            else{
                sc.next(); // limpiamos el buffer
                correcto = false;
            }
           }
           while(!correcto);

        //PEDIR SÍNTOMAS:
        System.out.println("\nINTRODUCE EL SÍNTOMA: ");
        System.out.println("\t1. Dolor (0)\n\t2. Lesión traumática (1)\n\t3. Fiebre alta (2)\n\t4. Confusión o desorientación (3)");

        do{
            if(sc.hasNextInt()){
                sintoma = sc.nextInt(); 

                if((sintoma >= SINTOMA_MIN) && (sintoma <= SINTOMA_MAX)){
                    correcto = true;
                    System.out.println("Síntoma introducido: " + sintoma); // si es correcto lo mostramos por pantalla
                }
                else{
                    correcto = false;
                    System.out.println("Error de rango."); // si no es correcto lo mostramos por pantalla
                    System.out.println("Valores válidos:" + SINTOMA_MIN + " - " + SINTOMA_MAX + ". Inténtelo de nuevo. "); // mostramos el rango
                }

                
            }
            else{
                
                correcto = false;

                System.out.println("Error de tipo. Introduzca un número entero."); // si no es correcto lo mostramos por
                sc.next(); // limpiamos el buffer
            }
        }
        while(!correcto);


        // Según síntoma pedimos exploración:
        do{
            switch (sintoma) {
                case 0:
                    System.out.println("DOLOR. ¿Exploración?\n\t1. Dolor torácico (0)\n\t2. Dolor abdominal (1)\n\t3. dolor de cabeza (2)\n\t4. Migraña (3)");

                    
                    break;
                case 1:
                break;
                case 2:
                break;
                case 3:
                break;
            
                default:
                    break;
            }
        }
        while(!correcto);


        // pedimos nivel prioridad

        // MOSTRAR UN RESUMEN

    }

}