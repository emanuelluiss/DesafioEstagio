import java.util.Scanner;

public class QuestaoTres{
  public static void main(String[] args) {
  
    System.out.println("Digite seu nome:");
    Scanner scanner = new Scanner(System.in);
    String nomePessoa = scanner.nextLine();
    scanner.close();

    System.out.println(nomePessoa.substring(0, nomePessoa.length() / 2));
  }
}