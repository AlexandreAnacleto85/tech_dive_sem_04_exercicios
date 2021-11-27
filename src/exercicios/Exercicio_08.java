package exercicios;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] numeros = new float[2];
        float answer;
        String operador;

        System.out.print("Digite o primeiro numero: ");
        numeros[0] = sc.nextFloat();

        System.out.print("Digite o segundo numero: ");
        numeros[1] = sc.nextFloat();

        System.out.print("Digite a operação (+,-,*,/): ");
        sc.nextLine();
        operador = sc.nextLine();

        answer = switch (operador) {
            case "+" -> numeros[0] + numeros[1];
            case "-" -> numeros[0] - numeros[1];
            case "*" -> numeros[0] * numeros[1];
            case "/" -> numeros[0] / numeros[1];
            default  -> throw new ArithmeticException("Operação invalida");
        };

        System.out.printf("O resultado é: %.2f", answer);
    }
}
