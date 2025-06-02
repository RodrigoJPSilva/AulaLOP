package Aula10;

import java.util.Scanner;

public class CalcSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = switch (operacao) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };

        System.out.printf("Resultado com erro: %.2f%n", resultado * 1.01);

        scanner.close();
    }
}
