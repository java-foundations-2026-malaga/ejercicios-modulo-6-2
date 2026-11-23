package modulo6_2_actividad10;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: implementa el menú.
        //Muestra el menú al menos una vez.
        //Usa un bucle do-while que muestre el menú (1. Saludar, 2. Despedir, 0. Salir) y lea una 
        //opción: con 1 muestra Hola, con 2 muestra Adiós y con 0 sale del bucle. 
        //Al terminar muestra Programa terminado. No muestres otros mensajes (el test introduce 1 y 0).
        int menu = 0;
        do {
        	System.out.println("1. Saludar \n2. Despedir \n0. Salir");
        	menu = input.nextInt();
        	if(menu == 1) System.out.println("Hola");
        	if(menu == 2) System.out.println("Adiós");
        } while (menu != 0);
        System.out.println("Programa terminado");
    }
}
