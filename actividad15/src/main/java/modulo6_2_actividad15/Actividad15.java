package modulo6_2_actividad15;

import java.util.Scanner;

public class Actividad15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: usa los tres tipos de bucle.
        //Combina for, while y do-while.
        //Con un bucle for, muestra For: y los números del 1 al 5 separados por espacios.
        //Con un bucle while, lee números hasta -1 (sin sumarlo) y muestra Suma while: y la suma.
        //Con un bucle do-while, muestra Menú mostrado y lee una opción; repite mientras la opción no sea 0.
        //No muestres mensajes para pedir los datos (el test introduce 3, 4, -1 y 0).
        
        System.out.print("For: ");
        int suma = 0;
        int numero = 0;
        for (int x = 1; x <= 5; x++) {
        	System.out.print(x+" ");
        }
        System.out.println("");
        while(numero != -1) {
        	 numero = input.nextInt();
        	 if (numero != -1 ) {
        		 suma += numero;
        	 } else {
        		 break;
        	 }
        }
        System.out.println("Suma while: "+suma);
        do {
        	numero = input.nextInt();
        	System.out.println("Menú mostrado");
        } while (numero != 0);
        
    }
}
