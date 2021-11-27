package exercicios;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio,raiz;
        int[] sequencia = new int[10];

        System.out.print("Digite um valor inicial: ");
        inicio = sc.nextInt();

        System.out.print("Digite um valor para a raiz: ");
        raiz = sc.nextInt();

        System.out.print("Digite 1 para PA  e 2 para PG: ");

        int option = sc.nextInt();
        if (option == 1)
            for (int i = 0; i < 10; i++) sequencia[i] = inicio + raiz * i;
        else if (option == 2)
            for (int i = 0; i < 10; i++) sequencia[i] = (int) (inicio * Math.pow(raiz, i));
        else {
            System.out.println("Opcao invalida"); return;
        }
        for (int i : sequencia)
            if (i==1)
            System.out.print(i);
            else{
                System.out.print("," + i);
            }
    }
}
