public class ex04 {
  public static void main(String[] args) {
    int soma = 0;
    double media = 0;

    for (int i = 1; i <= 50; i++) {
      soma += i;
    }

    media = soma / 50.0;

    System.out.println("A média é: " + media);
  }
}
