import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    // Escreva um programa que leia um número inteiro digitado pelo usuário e exiba
    // todos os números primos até esse número.

    Scanner scanner = new Scanner(System.in);

    int numero = 0;
    System.out.print("Digite um número inteiro: ");
    numero = scanner.nextInt();

    System.out.println("Números primos até " + numero + ":");

    for (int i = 2; i <= numero; i++) {
      boolean ehPrimo = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          ehPrimo = false;
          break;
        }
      }
      if (ehPrimo) {
        System.out.print(i + " ");
      }
    }
    System.out.println();

    scanner.close();
  }
}
