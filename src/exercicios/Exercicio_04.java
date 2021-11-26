package exercicios;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ehpar;
        int numero;

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        ehpar = numero % 2 == 0 ? "par" : "impar";

        System.out.printf("O numero %d é %s.", numero, ehpar);
    }
}
