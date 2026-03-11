import java.util.Scanner;

public class desafio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;
        IO.println("Digite o numero secreto");
        numero = sc.nextInt();

        if (numero == 24) {
            IO.println("Parabens vocẽ acertou");
        } else {
            IO.println("Vossa senhoria errou, tente novamente");
        }
    }
}
