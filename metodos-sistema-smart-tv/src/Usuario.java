public class Usuario {
  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo status: " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("Novo status: " + smartTv.ligada);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();

    System.out.println("Novo volume: " + smartTv.volume);

    smartTv.aumentarVolume();

    System.out.println("Novo volume: " + smartTv.volume);

    smartTv.mudarCanal(13);
    System.out.println("Canal atual: " + smartTv.canal);
  }
}
