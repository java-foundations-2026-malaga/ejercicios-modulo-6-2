package modulo6_2_actividad05;

import java.util.Scanner;

public class Actividad05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int total = 0;
    int value = 0;
    while (value != -1) {
      value = input.nextInt();
      total += value;
    }
    System.out.println("Suma: " + total);
  }
}
