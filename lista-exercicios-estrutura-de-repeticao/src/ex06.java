import java.util.Scanner;

public class ex06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número para exibir a tabuada: ");
    int numero = scanner.nextInt();
    scanner.close();

    for (int i = 1; i <= 10; i++) {
      int resultado = numero * i;
      System.out.printf("%d x %d = %d", numero, i, resultado);
      System.out.println();
    }
  }
}
