package exercicios;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        String nomecompleto = nome.trim() + " "+ sobrenome.trim();
        int letras = nome.trim().length() + sobrenome.trim().length();

        System.out.printf("%nSeu nome completo é %s. E possui %d letras. %n", nomecompleto, letras);
    }
}
