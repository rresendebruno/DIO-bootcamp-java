import java.util.Scanner;

public class ex13 {
  public static void main(String[] args) {
    // Escreva um programa que leia um número inteiro digitado pelo usuário e exiba
    // a soma dos seus dígitos

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int num = scanner.nextInt();
    int soma = 0;

    while (num > 0) {
      int resto = num % 10;
      soma += resto;
      num = num / 10;
    }

    System.out.println("A soma dos dígitos é: " + soma);
    scanner.close();
  }
}
