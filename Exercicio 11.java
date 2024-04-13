import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.print("Digite o número correspondente à sua escolha: ");
        int escolhaUsuario = scanner.nextInt();
        
        int escolhaComputador = random.nextInt(3) + 1;
        
        System.out.println("O computador escolheu: " + converterParaTexto(escolhaComputador));
        System.out.println("Você escolheu: " + converterParaTexto(escolhaUsuario));
        
        if (escolhaUsuario == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
                   (escolhaUsuario == 2 && escolhaComputador == 1) ||
                   (escolhaUsuario == 3 && escolhaComputador == 2)) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }
        
        scanner.close();
    }
    
    public static String converterParaTexto(int escolha) {
        switch (escolha) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Escolha inválida";
        }
    }
}