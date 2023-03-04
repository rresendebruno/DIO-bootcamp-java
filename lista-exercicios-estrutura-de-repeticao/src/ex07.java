import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {
    // Escreva um programa que leia 10 números digitados pelo usuário e exiba a soma
    // deles.

    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[10];
    int soma = 0;

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite 10 números inteiro: ");
      numeros[i] = scanner.nextInt();
    }

    for (int i = 0; i < numeros.length; i++) {
      soma += numeros[i];
    }

    System.out.println("A soma dos números digitados é: " + soma);
    scanner.close();
  }
}
