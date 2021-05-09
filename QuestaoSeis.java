import java.util.Scanner;

public class QuestaoSeis {
  public static void main(String[] args) {

    System.out.println("Digite a contagem regressiva:");
    Scanner scanner = new Scanner(System.in);
    int contador = scanner.nextInt();
    scanner.close();
    while (contador >= 1) {
      System.out.println(contador);
      --contador;
    }
    System.out.println(contador);
    System.out.println("KABUM");
  }
}
