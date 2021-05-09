import java.util.Scanner;

public class QuestaoDois{
  public static void main(String[] args) {
  
    System.out.println("Digite seu nome:");
    Scanner scanner = new Scanner(System.in);
    String nomePessoa = scanner.nextLine();
    scanner.close();
    
    System.out.println(new StringBuilder(nomePessoa).reverse().toString());
  }
}