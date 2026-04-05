import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Java ===");

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : 0;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (num2 != 0) {
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão: não é possível dividir por zero");
        }

        scanner.close();
    }
}