package modulo6_2_actividad11;

import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: suma diez números.
        //Lee exactamente diez valores.
        //Usa un bucle do-while que lea diez números con Scanner y muestre su suma. 
        //No muestres mensajes para pedir los datos (el test introduce los números del 1 al 10).
        int contador = 0;
        int valor = 0;
        do {
        	valor += input.nextInt();
        	contador++;
        } while (contador < 10);
        System.out.println("Suma: " + valor);
    }
}
