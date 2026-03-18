package logica;
import java.util.Scanner;
public class Saida {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("digite os numeros");
        double numeroum = sc.nextDouble();
        int numerodois = sc.nextInt();
        double numerotres = sc.nextDouble();
        int numeroquatro = sc.nextInt();
        IO.println("soma");
        IO.println(numeroum + numerodois + numerotres + numeroquatro);
        int num = sc.nextInt();
        IO.println(num);
    }


}
