import java.util.Scanner;

public class ex12 {
  public static void main(String[] args) {
    // Escreva um programa que leia um número inteiro digitado pelo usuário e exiba
    // a sequência de Collatz para esse número.

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    while (numero <= 0) {
      System.out.print("Digite um número que seja inteiro e maior que zero: ");
      numero = scanner.nextInt();
    }
    System.out.println("Sequência de Collatz para " + numero + ":");
    while (numero != 1) {
      if (numero % 2 == 0) {
        numero = numero / 2;
      } else {
        numero = 3 * numero + 1;
      }
      System.out.println(numero);
    }

    scanner.close();
  }
}
