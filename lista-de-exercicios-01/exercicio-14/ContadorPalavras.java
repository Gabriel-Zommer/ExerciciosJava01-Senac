import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();

        String[] palavras = new String[tamanho];

        System.out.println("Digite as palavras do array: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine();
        }

        scanner.close();

        Map<String, Integer> contadorPalavras = contarPalavras(palavras);

        System.out.println("Resultado:");
        for (Map.Entry<String, Integer> entry : contadorPalavras.entrySet()) {
            System.out.println("Palavra: " + entry.getKey() + " | Quantidade: " + entry.getValue());
        }
    }

    public static Map<String, Integer> contarPalavras(String[] palavras) {
        Map<String, Integer> contadorPalavras = new HashMap<>();
        for (String palavra : palavras) {
            if (contadorPalavras.containsKey(palavra)) {
                contadorPalavras.put(palavra, contadorPalavras.get(palavra) + 1);
            } else {
                contadorPalavras.put(palavra, 1);
            }
        }
        return contadorPalavras;
    }
}
