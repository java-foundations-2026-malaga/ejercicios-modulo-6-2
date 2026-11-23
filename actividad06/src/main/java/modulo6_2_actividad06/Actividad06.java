package modulo6_2_actividad06;

public class Actividad06 {
    public static void main(String[] args) {
        // TODO: crea la cuenta atrás.
    	//Imprime desde 10 hasta 0 y Blast Off!.
    	//Usa un bucle while. Los números van en la misma línea separados por un espacio.
    	int value = 10;
        while (value >= 0) {
        	if (value != 0) {
        		System.out.print(value + " ");
        	} else {
        		System.out.print(value + "\nBlast Off!");
        	}
        	value--;
        	
        }
    }
}
