import java.util.Scanner;

public class ex14 {
  public static void main(String[] args) {
    // Escreva um programa que leia um número inteiro digitado pelo usuário e exiba
    // o fatorial desse número.

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro para saber seu fatorial: ");
    int numero = scanner.nextInt();

    System.out.printf("Fatorial de %d!: ", numero);

    scanner.close();
  }
}
