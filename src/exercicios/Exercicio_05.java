package exercicios;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;
        int numero, sorteio;

        System.out.println("Adivinhe qual número de 1 a 5: ");
        sorteio = sc.nextInt();
        numero = (int) (Math.random() * (6 - 1) + 1);

        resposta = numero == sorteio ? "Você acertou!" :
                String.format("Errado, o número correto era %d", numero);

        System.out.print(resposta);
    }
}
