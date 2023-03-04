public class ex04 {
  public static void main(String[] args) {
    // Escreva um programa que exiba a média dos números de 1 a 50 usando um loop
    // for.

    int soma = 0;
    double media = 0;

    for (int i = 1; i <= 50; i++) {
      soma += i;
    }

    media = soma / 50.0;

    System.out.println("A média é: " + media);
  }
}
