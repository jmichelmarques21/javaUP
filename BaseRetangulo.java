// Exercício 01 - Escrever um programa que receba a altura e a largura de um retângulo e calcule a sua área.
import java.util.Scanner;
public class BaseRetangulo {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira a altura do retângulo: ");
    int altura = scan.nextInt();
    System.out.println("Insira a largura do retângulo: ");
    int largura = scan.nextInt();

    int area = altura * largura;

    System.out.println("A base do retângulo é: " + area);









    scan.close();

  }
}
