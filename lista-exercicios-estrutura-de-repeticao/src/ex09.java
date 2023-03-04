import java.util.Scanner;

public class ex09 {
  public static void main(String[] args) {

    // Escreva um programa que leia um número inteiro digitado pelo usuário e exiba
    // a sequência de Fibonacci até esse número.

    Scanner scanner = new Scanner(System.in);

    int inputUsuario = 0;

    System.out.print("Digite um número inteiro: ");
    inputUsuario = scanner.nextInt();

    int numeroAnterior1 = 0;
    int numeroAnterior2 = 1;
    int proximoNumero = 0;

    System.out.printf("Sequência de Fibonacci até %d: ", inputUsuario);
    System.out.println();

    while (proximoNumero <= inputUsuario) {
      System.out.println(proximoNumero + " ");

      proximoNumero = numeroAnterior1 + numeroAnterior2;
      numeroAnterior1 = numeroAnterior2;
      numeroAnterior2 = proximoNumero;
    }

    scanner.close();
  }
}
