import java.util.Arrays;

public class ArrayReverso {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numerosReversos = obterArrayReverso(numeros);
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array reverso: " + Arrays.toString(numerosReversos));
    }

    public static int[] obterArrayReverso(int[] numeros) {
        int[] numerosReversos = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            numerosReversos[i] = numeros[numeros.length - 1 - i];
        }
        return numerosReversos;
    }
}
