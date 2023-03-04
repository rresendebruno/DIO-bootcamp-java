public class ex05 {
  public static void main(String[] args) {
    // Escreva um programa que exiba os números ímpares de 1 a 30 usando um loop
    // do-while.

    int i = 1;

    do {
      if (i % 2 != 0) {
        System.out.print(i + ", ");
      }
      i++;
    } while (i <= 30);
  }
}
