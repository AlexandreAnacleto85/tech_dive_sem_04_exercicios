package exercicios;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, peso, imc;

        System.out.print("Digite sua altura com 2 ou mais casas decimais: ");
        altura = sc.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();
        imc = peso / (altura * altura);

        System.out.printf("%nSeu IMC é de: %.1f", imc);
    }
}
