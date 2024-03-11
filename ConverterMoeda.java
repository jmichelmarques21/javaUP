/* Exercício 02 - Crie um programa que permita fazer três conversões monetárias. O algoritmo deve receber o valor em real (R$)
  e apresentar os valores convertidos em:
  1. Dólar (1 Dólar = R$5,17);
  2. Euro (1 Euro = R$6,14);
  3. Peso argentino (1 peso argentino = R$0,05).
*/
import java.util.Scanner;
public class ConverterMoeda {

  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira um valor em reais (R$): ");
    float reais = scan.nextFloat();

    System.out.printf("Valor em dólar: %.2f %n", reais / 5.17);
    System.out.printf("Valor em euro: %.2f %n", reais / 6.14);
    System.out.printf("Valor em pesos argentinos: %.2f %n", reais / 0.05);








    scan.close();
  }

}
