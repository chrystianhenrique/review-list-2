import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String palavra = scanner.nextLine().toLowerCase().replaceAll("\\s+", ""); 
        
        if (ehPalindromo(palavra)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
        
        scanner.close();
    }
    
    public static boolean ehPalindromo(String palavra) {
        return palavra.equals(new StringBuilder(palavra).reverse().toString());
    }
}