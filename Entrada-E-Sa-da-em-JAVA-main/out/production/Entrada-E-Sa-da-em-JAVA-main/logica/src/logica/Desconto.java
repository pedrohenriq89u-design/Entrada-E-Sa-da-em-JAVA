package logica;

import java.util.Scanner;

public class Desconto {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite o valor de vossa compra");
        double valor = sc.nextDouble();
        if (valor > 0 & valor < 100) {
            IO.println("Vossa compra não teve desconto");
        } else if (valor > 100 & valor <= 500) {
            IO.println();

            double desconto = valor - (valor * 0.1);
            IO.println("Vosssa compra tem 10% de desconto!! valor total " + desconto);

        } else if (valor > 500) {
            IO.println();

            double desconto = valor - (valor * 0.2);
            IO.println("Vosssa compra tem 20% de desconto!! valor total " + desconto);

        } else {
            if (valor <= 0) {
                IO.println("Valor inválido");
            }
        }
    }
}
