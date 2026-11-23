package modulo6_2_actividad14;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = -1;
        // TODO: compara ambos tipos de bucle.
        //Implementa ambas validaciones con el mismo resultado.
        //Primero, con un bucle while, lee números hasta obtener uno no negativo y muestra While válido: 
        //y el número. Después repite la misma validación con un bucle do-while y muestra Do-while válido: 
        //y el número. No muestres mensajes para pedir los datos (el test introduce -2, 4, -3 y 5).
        while(numero < 0) {
        	numero = input.nextInt();
        }
        System.out.println("While válido: " + numero);
        do {
        	numero = input.nextInt();
        } while (numero < 0);
        System.out.println("Do-while válido: " + numero);
        
    }
}
