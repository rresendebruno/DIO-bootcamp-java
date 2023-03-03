import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[10];
    int soma = 0;
    double media = 0;

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite 10 números inteiros para saber a média entre eles: ");
      numeros[i] = scanner.nextInt();
    }

    for (int i = 0; i < numeros.length; i++) {
      soma += numeros[i];
    }

    media = soma / 10;

    System.out.println("A média dos números são: " + media);
    scanner.close();
  }
}
