import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        scanner.close();

        int mdc = calcularMDC(numero1, numero2);

        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é: " + mdc);
    }

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
