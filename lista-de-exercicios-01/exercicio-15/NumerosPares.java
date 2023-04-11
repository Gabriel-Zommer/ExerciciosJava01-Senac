import java.util.Arrays;

public class NumerosPares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numerosPares = obterNumerosPares(numeros);
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array com números pares: " + Arrays.toString(numerosPares));
    }

    public static int[] obterNumerosPares(int[] numeros) {
        int count = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                count++;
            }
        }

        int[] numerosPares = new int[count];
        int index = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares[index++] = numero;
            }
        }

        return numerosPares;
    }
}
