import java.util.Scanner;

public class desafio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int idade;
        IO.println("Me diga sua idade");
        idade = sc.nextInt();

        if (idade >=0.1 & idade <=12) {
            IO.println("Infantil");
        } else {
            if (idade >=13 & idade <=17) {
                IO.println("Juvenil");
            } else {
                if (idade >=18 & idade <=39) {
                    IO.println("Adulto");
                }else {
                    if (idade >= 40);
                    IO.println("Master");
                }
            }
        }
    }
}