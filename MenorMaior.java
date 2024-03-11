// Exercício 03 - Receber dois números inteiros e informar qual valor lido é o menor e qual é o maior.

import java.util.Scanner;
public class MenorMaior {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int num1 = scan.nextInt();
    System.out.println("Digite o segundo número: ");
    int num2 = scan.nextInt();

    if (num1 > num2) {
      System.out.printf("O número %d é o maior e o %d é o menor!", num1, num2);
    } else {
      System.out.printf("O número %d é o maior e o %d é o menor!", num2, num1);
    }



    scan.close();
  }

}
