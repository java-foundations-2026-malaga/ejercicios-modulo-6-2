package modulo6_2_actividad09;

import java.util.Scanner;

public class Actividad09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: valida el número.
        //Repite la lectura y muestra la raíz cuadrada.
        //Lee un número con Scanner. Mientras sea negativo, muestra Número no válido y vuelve a leer. 
        //Cuando sea válido, muestra Raíz: seguido de Math.sqrt(numero). 
        //No muestres mensajes para pedir los datos (el test introduce -4 y 25).
        int total = 0;
        int value = 0;
        while (value <= 0) {
        	value = input.nextInt();
            if(value <=0) System.out.println("Número no válido");
        }
        System.out.println("Raíz: " + Math.sqrt(value));
    }
}
