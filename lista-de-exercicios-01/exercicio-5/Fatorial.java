import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        sc.close();
        
        int fatorial = calcularFatorial(num);
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }

    public static int calcularFatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calcularFatorial(num - 1);
        }
    }
}
