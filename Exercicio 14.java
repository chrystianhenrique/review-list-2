import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a média necessária para aprovação: ");
        double mediaAprovacao = scanner.nextDouble();
        
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        
        if (nota >= mediaAprovacao) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
        
        scanner.close();
    }
}