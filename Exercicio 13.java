import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite três números:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        
        int maior = encontrarMaior(numero1, numero2, numero3);
        
        System.out.println("O maior número é: " + maior);
        
        scanner.close();
    }
    
    public static int encontrarMaior(int num1, int num2, int num3) {
        int maior = num1;
        
        if (num2 > maior) {
            maior = num2;
        }
        
        if (num3 > maior) {
            maior = num3;
        }
        
        return maior;
    }
}