import java.util.Scanner;

public class QuestaoQuatro{
  public static void main(String[] args) {
  
    System.out.println("Digite sua data de nascimento:");
    Scanner scanner = new Scanner(System.in);
    String dataNascimento = scanner.nextLine();
    String formata = formataBarra(dataNascimento);
    scanner.close();
    String [] data = formata.split("");

    int soma = 0;
    int tmp = 0;
    for(int i = 0; i < data.length; i++){
      soma = soma + Integer.parseInt(data[i]);
      tmp = Integer.parseInt(data[i]);
      //Remover último elemento do índice
      System.out.print(i < data.length - 1 ? data[i] +  " + " : data[i] + "");
      
    }
    System.out.print(" = " + soma);
  }
  //Método para digitar data com a barra
    public static String formataBarra(String dado){
    dado = dado.replaceAll("/",""); 
    return dado;
  }
}