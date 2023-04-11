import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite para os números de Fibonacci: ");
        int limite = scanner.nextInt();
        scanner.close();

        System.out.println("Números de Fibonacci até o limite de " + limite + ":");
        for (int i = 0; i <= limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
