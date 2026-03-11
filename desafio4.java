import java.util.Scanner;

public class desafio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;
        IO.println("Me diga um numero");
        numero = sc.nextInt();

        if (numero == 0) {
            IO.println("O numero e zero");
        } else {
            if (numero > 0) {
                IO.println("numero positivo");
            } else {
                if (numero < 0){
                    IO.println("numero negativo");
                }
                }

            }
        }
    }

