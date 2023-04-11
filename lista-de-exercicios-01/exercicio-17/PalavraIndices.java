import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalavraIndices {
    public static void main(String[] args) {
        String[] palavras = {"apple", "banana", "orange", "apple", "grape", "banana"};
        Map<String, List<Integer>> palavraIndices = obterPalavraIndices(palavras);
        System.out.println("Palavra -> Índices:");
        for (String palavra : palavraIndices.keySet()) {
            System.out.println(palavra + " -> " + palavraIndices.get(palavra));
        }
    }

    public static Map<String, List<Integer>> obterPalavraIndices(String[] palavras) {
        Map<String, List<Integer>> palavraIndices = new HashMap<>();
        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i];
            if (palavraIndices.containsKey(palavra)) {
                palavraIndices.get(palavra).add(i);
            } else {
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                palavraIndices.put(palavra, indices);
            }
        }
        return palavraIndices;
    }
}
