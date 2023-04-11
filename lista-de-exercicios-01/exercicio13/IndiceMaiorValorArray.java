import java.util.Scanner;

public class IndiceMaiorValorArray {
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

        int indiceMaiorValor = encontrarIndiceMaiorValorArray(numeros);

        System.out.println("O índice do maior valor do array é: " + indiceMaiorValor);
    }

    public static int encontrarIndiceMaiorValorArray(int[] array) {
        int indiceMaiorValor = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indiceMaiorValor]) {
                indiceMaiorValor = i;
            }
        }
        return indiceMaiorValor;
    }
}
