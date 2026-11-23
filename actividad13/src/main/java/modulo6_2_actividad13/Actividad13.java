package modulo6_2_actividad13;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: calcula cantidad y promedio.
        //Lee notas hasta -1 y calcula el promedio.
        //Lee notas con Scanner hasta que se introduzca -1 (que no cuenta), muestra cuántas notas se han leído y 
        //su promedio como número decimal. No muestres mensajes para pedir los datos 
        //(el test introduce 7, 8, 9 y -1).
        double nota = 0.0;
        double notaSuma = 0.0;
        double promedio = 0.0;
        int cantidad = 0;
        boolean salir = false;
        do {
        	nota =input.nextDouble();
        	if (nota != -1.0) {
        		notaSuma += nota;
        		cantidad++;
        	} else {
        		salir = true;
        	}
        	promedio = notaSuma/cantidad;
        } while (!salir);
        System.out.print("Cantidad: "+cantidad+"\n"
            + "Promedio: "+promedio);
    }
}
