package exercicios;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int fatorial = 1;

        System.out.print("Digite um numero de 0 a 10: ");
        numero = sc.nextInt();

        if (numero > 10 || numero < 0) {
            System.out.printf("Número invalido!%n");
            return;
        }

        for (int i = numero; i >= 2 ; i--) fatorial *= i;
        System.out.printf("O fatorial de %d é %d%n", numero, fatorial );
    }
}
