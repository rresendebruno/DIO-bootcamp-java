public class App {
  public static void main(String[] args) throws Exception {

    ifFlecha();
    ifSemFlecha();
    ifFerias();
    ifMenor();

    switchSemana();
    switchNumero();
    switchFerias();

  }

  private static void ifFlecha() {
    int mes = 9;

    if (mes == 1) {
      System.out.println("Janeiro");
    } else {
      if (mes == 2) {
        System.out.println("Fevereiro");
      } else {
        if (mes == 3) {
          System.out.println("Março");
        } else {
          if (mes == 4) {
            System.out.println("Abril");
          } else {
            if (mes == 5) {
              System.out.println("Maio");
            } else {
              if (mes == 6) {
                System.out.println("Junho");
              } else {
                if (mes == 7) {
                  System.out.println("Julho");
                } else {
                  if (mes == 8) {
                    System.out.println("Agosto");
                  } else {
                    if (mes == 9) {
                      System.out.println("Setembro");
                    } else {
                      if (mes == 10) {
                        System.out.println("Outubro");
                      } else {
                        if (mes == 11) {
                          System.out.println("Novembro");
                        } else {
                          if (mes == 12) {
                            System.out.println("Dezembro");
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private static void ifSemFlecha() {
    int mes = 9;

    if (mes == 1) {
      System.out.println("Janeiro");
    } else if (mes == 2) {
      System.out.println("Fevereiro");
    } else if (mes == 3) {
      System.out.println("Março");
    } else if (mes == 4) {
      System.out.println("Abril");
    } else if (mes == 5) {
      System.out.println("Maio");
    } else if (mes == 6) {
      System.out.println("Junho");
    } else if (mes == 7) {
      System.out.println("Julho");
    } else if (mes == 8) {
      System.out.println("Agosto");
    } else if (mes == 9) {
      System.out.println("Setembro");
    } else if (mes == 10) {
      System.out.println("Outubro");
    } else if (mes == 11) {
      System.out.println("Novembro");
    } else if (mes == 12) {
      System.out.println("Dezembro");
    }
  }

  private static void ifFerias() {

    String mes = "Junho";
    if (mes == "Junho" || mes == "Dezembro" || mes == "Janeiro") {
      System.out.println("Férias!");
    }

  }

  private static void ifMenor() {

    double salarioMensal = 11893.58d;
    double mediaSalario = 10500d;

    int quabntidadeDependentes = 4;
    int mediaDependentes = 2;

    System.out.println((salarioMensal < mediaSalario) && (quabntidadeDependentes >= mediaDependentes));

    boolean salarioBaixo = salarioMensal < mediaSalario;
    boolean muitosDependentes = quabntidadeDependentes >= mediaDependentes;

    System.out.println((salarioBaixo) && (muitosDependentes));

    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
    System.out.println("Recebe auxilio? " + recebeAuxilio);
  }

  private static void switchSemana() {
    int diaSemana = 1;

    switch (diaSemana) {
      case 1:
        System.out.println("Domingo");
        break;

      case 2:
        System.out.println("Segunda");
        break;

      case 3:
        System.out.println("Terça");
        break;

      case 4:
        System.out.println("Quarta");
        break;

      case 5:
        System.out.println("Quinta");
        break;

      case 6:
        System.out.println("Sexta");
        break;

      case 7:
        System.out.println("Sábado");
        break;
    }
  }

  private static void switchNumero() {
    String diaSemana = "Sábado";

    switch (diaSemana) {
      case "Domingo":
        System.out.println("1");
        break;

      case "Segunda":
        System.out.println("2");
        break;

      case "Terça":
        System.out.println("3");
        break;

      case "Quarta":
        System.out.println("4");
        break;

      case "Quinta":
        System.out.println("5");
        break;

      case "Sexta":
        System.out.println("6");
        break;

      case "Sábado":
        System.out.println("7");
        break;
    }
  }

  private static void switchFerias() {
    String mes = "Junho";

    switch (mes) {
      case "Junho":
        System.out.println("Férias!");
        break;

      case "Dezembro":
        System.out.println("Férias!");
        break;

      case "Janeiro":
        System.out.println("Férias!");
        break;
    }
  }
}