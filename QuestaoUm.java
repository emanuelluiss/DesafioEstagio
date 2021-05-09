import java.util.Scanner;

public class QuestaoUm{
  public static void main(String[] args) {
  
    System.out.println("Digite seu nome:");
    Scanner scanner = new Scanner(System.in);
    String nomePessoa = scanner.nextLine();
    scanner.close();
    int comprimento = nomePessoa.length();
    
    System.out.println("Você digitou: " + nomePessoa);
    System.out.println("Quantidade de caracteres é: " + comprimento);
  }
}