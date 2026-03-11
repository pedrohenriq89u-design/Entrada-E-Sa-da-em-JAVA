import java.util.Scanner;

public class voto {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int voto;
        IO.println("Qual sua idade?");
        voto = sc.nextInt();

        if (voto >= 18) {
            IO.println("Vocẽ pode votar");
        } else {
            if (voto < 18) {
                IO.println("Vocẽ não pode votar");
            }
        }
    }
}
