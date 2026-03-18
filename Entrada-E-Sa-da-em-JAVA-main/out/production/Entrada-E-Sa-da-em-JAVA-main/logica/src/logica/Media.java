package logica;

import java.util.Scanner;

public class Media {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int media;
        IO.println("Digite suas notas");
        double numeroUm = sc.nextDouble();
        double numerodois = sc.nextDouble();
        IO.println("Sua média:");
        IO.println(numeroUm / 2 + numerodois / 2);

        if (numeroUm / 2 + numerodois / 2 > 7) {
            IO.println("Voce foi aprovado");
        } else {
            if (numeroUm / 2 + numerodois / 2 > 4) {
                IO.println("Voce esta de recuperaçao");
            } else {
                if (numeroUm / 2 + numerodois / 2 < 4) {
                    IO.println(" Voce foi reprovado");
                }


            }
        }
    }
}