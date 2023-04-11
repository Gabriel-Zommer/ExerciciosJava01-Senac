import java.util.Scanner;

public class MMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int mmc = calcularMMC(numero1, numero2);

        System.out.println("O MMC de " + numero1 + " e " + numero2 + " é: " + mmc);
    }

    public static int calcularMMC(int numero1, int numero2) {
        int a = numero1;
        int b = numero2;

        
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        
        int mdc = a;
        int mmc = (numero1 * numero2) / mdc;

        return mmc;
    }
}
