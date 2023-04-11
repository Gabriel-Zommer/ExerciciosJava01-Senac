import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String palavra = scanner.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.println("A palavra/frase é um palíndromo.");
        } else {
            System.out.println("A palavra/frase não é um palíndromo.");
        }

        scanner.close(); 
    }

    public static boolean ehPalindromo(String palavra) {
    
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false; 
            }

            inicio++;
            fim--;
        }

        return true; 
}
}
