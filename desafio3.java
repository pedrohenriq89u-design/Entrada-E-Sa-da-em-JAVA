import java.util.Scanner;

public class desafio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numeros;
        IO.println("Digite as 3 notas");
        int numeroUm = sc.nextInt();
        int numerodois = sc.nextInt();
        int numeroTres = sc.nextInt();
        IO.println("media:");
        IO.println(numeroUm / 3 + numerodois / 3 + numeroTres / 3);

        if (numeroUm/3 + numerodois /3 + numeroTres /3 > 7) {
            IO.println("Voce foi aprovado");
        } else {
            if (numeroUm / 3 + numerodois / 3 + numeroTres / 3  > 4 ) {
                IO.println("Voce esta de recuperaçao");
            } else {
                if (numeroUm / 3 + numerodois / 3 + numeroTres / 3 < 4) {
                    IO.println(" Voce foi reprovado");
                }


            }
        }
    }
}
