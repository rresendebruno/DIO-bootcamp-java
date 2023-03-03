public class App {
  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    int x = 4;

    while (x <= 15) {
      System.out.println("Valor de x: " + x);
      x++;
    }

    String[] alunos = {
        "Bruno",
        "Henrique",
        "Resende",
    };

    for (int i = 0; i < alunos.length; i++) {
      System.out.println(alunos[i]);
    }

    // Array multidimensional
    int[][] notas = {
        { 7, 8, 6 },
        { 9, 7, 8 },
        { 5, 6, 7 },
        { 8, 7, 9 }
    };

    for (int i = 0; i < notas.length; i++) {
      System.out.print("Notas do aluno " + (i + 1) + ": ");
      for (int j = 0; j < notas[i].length; j++) {
        System.out.print(notas[i][j] + " ");
      }
      System.out.println();
    }
  }
}
