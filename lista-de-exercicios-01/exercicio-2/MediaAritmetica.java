import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de números: ");
        int quantidade = scanner.nextInt();
        
        
        double[] numeros = new double[quantidade];
        
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
        
        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += numeros[i];
        }
        double media = soma / quantidade;
        
        System.out.println("A média aritmética dos números informados é: " + media);
        
        scanner.close();
    }
}
