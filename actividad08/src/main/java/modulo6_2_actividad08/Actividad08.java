package modulo6_2_actividad08;

import java.util.Scanner;

public class Actividad08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: suma hasta -1.
        //Lee hasta el centinela y no lo sumes.
        //Usa un Scanner y un bucle while (o do-while). No muestres mensajes para pedir los datos 
        //(el test introduce 4, 5, 6 y -1).
        int total = 0;
        int value = 0;
        while (value != -1) {
            value = input.nextInt();
            if(value != -1) total += value;
        }
        System.out.println("Suma: " + total);
    }
}
