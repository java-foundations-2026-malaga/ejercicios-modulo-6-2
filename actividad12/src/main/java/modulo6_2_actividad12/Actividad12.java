package modulo6_2_actividad12;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: limita los intentos.
        //Acepta la clave o detente tras tres intentos.
        //La contraseña correcta es 1234. Lee contraseñas con Scanner: si es incorrecta muestra Contraseña 
        //incorrecta; si es correcta muestra Acceso concedido y termina. 
        //Tras tres intentos fallidos el programa debe detenerse sin pedir más (puedes mostrar Acceso bloqueado). 
        //No muestres mensajes para pedir los datos (el test introduce 1111, 2222 y 1234).
        String contrasenia = "1234";
        String contraniaIntro = "";
        int contador = 0;
        do {
        	contraniaIntro = input.next();
        	if (!contraniaIntro.equalsIgnoreCase(contrasenia)) {
        		System.out.println("Contraseña incorrecta");
        	} else {
        		System.out.println("Acceso concedido");
        		contador = 2;
        	}
        	contador++;
        } while (contador < 3);
        if(!contraniaIntro.equalsIgnoreCase(contrasenia))System.out.println("Acceso bloqueado");
    }
}
