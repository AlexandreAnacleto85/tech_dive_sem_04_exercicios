package exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento (dd/mm/aaaa): ");

        String[] dataAniversario = sc.nextLine().split("/");

        LocalDate start = LocalDate.of(Integer.parseInt(dataAniversario[2]),
                Integer.parseInt(dataAniversario[1]),
                Integer.parseInt(dataAniversario[0])),
                now = LocalDate.now();

        long idade = ChronoUnit.YEARS.between(start, now);
        System.out.println(idade < 18 ? "você é menor de idade" : "você é maior de idade");
    }
}
