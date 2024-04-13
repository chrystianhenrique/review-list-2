import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor original do produto: ");
        double valorOriginal = scanner.nextDouble();
        
        System.out.print("Digite a taxa de desconto (%): ");
        double taxaDesconto = scanner.nextDouble();
        
        double desconto = valorOriginal * (taxaDesconto / 100);
        double valorComDesconto = valorOriginal - desconto;
        
        System.out.println("O desconto aplicado é de R$" + desconto);
        System.out.println("O valor do produto com desconto é de R$" + valorComDesconto);
        
        scanner.close();
    }
}