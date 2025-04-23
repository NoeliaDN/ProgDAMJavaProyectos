package Actividad1Urgencias;

import java.util.Scanner; //para usar el scanner

public class URGENCIAS {

public static final int NUSS_MIN = 100000, NUSS_MAX=999999; // nuss mínimo y máximo

    public static void main(String[] args) {
        
        //BLOQUE DECLARACION DE VARIABLES

Scanner sc = new Scanner(System.in); //para usar el scanner

int nuss=0, sintoma=0, exploracion=0, prioridad=0, temperatura=0; //variables para guardar los datos del paciente
boolean correcto = false; //variable para comprobar si el nuss es correcto


        //PEDIR DATOS DE UN PACIENTE:

        //pedir datos del paciente

        // número de la SS


        // pedimos síntoma

        //se gún síntoma pedimos exploración

        // pedimos nivel prioridad


        //pedimos temperatura
System.out.println("Introduce el NUSS: ");
System.out.printl("Valores válidos:" + NUSS_MIN + " - " + NUSS_MAX);
nuss=sc.nextInt(); //guardamos el nuss en la variable nuss


do{
    if ((nuss>=NUSS_MIN) && (nuss<=NUSS_MAX)) { //comprobamos que el nuss es correcto
    System.out.println("NUSS correcto"); //si es correcto lo decimos
} 
else { //si no es correcto
    System.out.println("NUSS incorrecto"); //lo decimos
    System.exit(0); //salimos del programa

}
        //MOSTRAR UN RESUMEN
    }

while (!correcto); //mientras el nuss no sea correcto pedimos otro nuss


    }
}