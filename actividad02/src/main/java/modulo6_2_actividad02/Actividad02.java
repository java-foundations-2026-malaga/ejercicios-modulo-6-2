package modulo6_2_actividad02;

public class Actividad02 {
    public static void main(String[] args) {
        int num = 0;
        while (num > 10) {
            num++;
            System.out.print(num + (num < 10 ? " " : ""));
        }
    }
}
