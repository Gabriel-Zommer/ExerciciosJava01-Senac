import java.util.Scanner;

public class MenorValorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];

        System.out.println("Digite os números do array: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        int menorValor = encontrarMenorValorArray(numeros);

        System.out.println("O menor valor do array é: " + menorValor);
    }

    public static int encontrarMenorValorArray(int[] array) {
        int menorValor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menorValor) {
                menorValor = array[i];
            }
        }
        return menorValor;
    }
}
