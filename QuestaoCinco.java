import java.util.Scanner;

public class QuestaoCinco {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  
    int ddd;
    System.out.println("Digite o DDD:");
    ddd = scanner.nextInt();
    scanner.close();
    //int ddd = 55;

      switch (ddd) {
          case 61:
              System.out.println("Brasília.");
              break;
          case 71:
              System.out.println("Salvador.");
              break;
          case 11:
              System.out.println("São Paulo.");
              break;
          case 21:
              System.out.println("Rio de Janeiro.");
              break;
          case 32:
              System.out.println("Juiz de Fora.");
              break;
          case 19:
              System.out.println("Campinas");
              break;
          default:
              System.out.println("DDD não cadastrado.");
              break;
      }
  }
}
