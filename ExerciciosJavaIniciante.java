import java.util.Scanner;

public class ExerciciosJavaIniciante {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /* Exercício 01 - Calcular a média de três notas: Faça um programa que leia três notas de um aluno e calcule a sua média. */

    /*System.out.println("Digite a primeira nota: ");
    float n1 = scan.nextFloat();
    System.out.println("Digite a segunda nota: ");
    float n2 = scan.nextFloat();
    System.out.println("Digite a terceira nota: ");
    float n3 = scan.nextFloat();
    float media = (n1 + n2 + n3) / 3;

    System.out.printf("\nA média final do aluno é: %.2f", media);*/

    /* Exercício 02 - Calcular a área de um triângulo: Faça um programa que leia a base e altura de um triângulo e calcule sua área. */

    /* System.out.println("Informe a base do triângulo: ");
    float base = scan.nextFloat();
    System.out.println("Informe a altura do triângulo: ");
    float altura = scan.nextFloat();

    float area = (base * altura) / 2;

    System.out.printf("A área do triângulo é: %.2f", area); */


    /* Exercício 03 - Calcular o IMC: Faça um programa que leia o peso e a altura de uma pessoa e calcule seu IMC. */

    /*System.out.println("Informe a sua altura: ");
    float altura = scan.nextFloat();
    System.out.println("Informe o seu peso: ");
    float peso = scan.nextFloat();

    float imc = peso / (altura * altura);

    System.out.printf("O seu IMC é de: %.2f\n", imc);
    
    if (imc < 16.9) {
      System.out.println("Muito abaixo do peso.");
    } else if (imc > 16.9 && imc < 18.4) {
      System.out.println("Abaixo do peso.");
    } else if (imc > 18.4 && imc < 24.9) {
      System.out.println("Peso normal.");
    } else if (imc > 24.9 && imc < 29.9) {
      System.out.println("Acima do peso.");
    } else if (imc > 29.9 && imc < 34.9) {
      System.out.println("Obesidade grau I.");
    } else if (imc > 34.9 && imc < 40) {
      System.out.println("Obesidade grau II.");
    } else {
      System.out.println("Obesidade grau III.");
    }*/

    /* Exercício 04 - Ler um número e verificar se ele é par ou ímpar: Faça um programa que leia um número e imprima se ele é par ou ímpar. */

    /*System.out.println("informe um número inteiro: ");
    int num = scan.nextInt();

    if (num % 2 == 0) {
      System.out.println("O número informado é par!");
    } else {
      System.out.println("O número informado é ímpar!");
    }*/

    /* Exercício 05 - Ler um número e verificar se ele é positivo ou negativo: Faça um programa que leia um número e imprima se ele é positivo ou negativo. */

    /*System.out.println("Informe um número: ");
    int num = scan.nextInt();

    if (num >= 0) {
      System.out.println("O número informado é positivo.");
    } else {
      System.out.println("O número informado é negativo.");
    }*/

    scan.close();
    }
}
