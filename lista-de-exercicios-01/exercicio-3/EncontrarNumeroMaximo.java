import java.util.Scanner;

public class EncontrarNumeroMaximo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números na lista: ");
        int quantidadeNumeros = scanner.nextInt();

        int numeroMaximo = Integer.MIN_VALUE; 

        System.out.println("Digite os números da lista:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Número #" + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > numeroMaximo) { 
                numeroMaximo = numero; 
            }
        }

        System.out.println("O número máximo é: " + numeroMaximo);

        scanner.close(); 
    }
}
