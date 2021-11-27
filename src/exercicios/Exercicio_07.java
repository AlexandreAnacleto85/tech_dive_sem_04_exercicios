package exercicios;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[3];

        for (int i = 1; i <= 3 ; i++) {
            System.out.printf("Digite sua nota do semestre %d: ",i);
            notas[i - 1] = sc.nextFloat();
        }
        float media = (notas[0] + notas[1] + notas[2]) / notas.length;

        System.out.printf("%n A média final é: %.2f", media);
    }
}
