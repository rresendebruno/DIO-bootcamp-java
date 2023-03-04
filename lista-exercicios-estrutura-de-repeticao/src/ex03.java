public class ex03 {
  public static void main(String[] args) {
    // Escreva um programa que exiba a soma dos números de 1 a 100 usando um loop
    // while.

    int i = 0;
    int soma = 0;

    while (i <= 100) {
      soma += i;
      i++;
    }

    System.out.println("A soma dos números de 1 a 100 é: " + soma);
  }
}
