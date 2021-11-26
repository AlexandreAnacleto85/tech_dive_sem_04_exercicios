package exercicios;

import java.time.LocalTime;

public class Exercicio_01 {
    public static void main(String[] args) {
        int hora = LocalTime.now().getHour();
        int minuto = LocalTime.now().getMinute();
        String testarHora = hora >= 18 ? "Boa noite" :
                            hora >= 12 ? "Boa tarde" :
                            hora >= 6  ? "Bom dia" :
                                    "";

        System.out.printf("%s, no momento são %02d:%02d %n", testarHora, hora, minuto);
    }
}
