public class ex11 {
  public static void main(String[] args) {
    // Escreva um programa que exiba a soma dos números pares de 1 a 100 usando um
    // loop for e continue.

    int soma = 0;

    for (int i = 0; i <= 100; i++) {
      if (i % 2 != 0) {
        // Se i for impar, pula para a próxima iteração.
        continue;
      }
      soma += i; // Se i for par, adicione a soma.
    }
    System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
  }
}