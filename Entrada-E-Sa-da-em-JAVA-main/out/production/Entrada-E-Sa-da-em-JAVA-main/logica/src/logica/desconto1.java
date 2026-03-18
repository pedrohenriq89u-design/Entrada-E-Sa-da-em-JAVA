package logica;

import java.util.Scanner;

public class desconto1 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        IO.println("Digite o usuário:");
        String usuario = sc.nextLine();
        IO.println("Digite sua senha:");
        String senha = sc.nextLine();

        if (usuario == usuarioCorreto & senha == senhaCorreta) {
            IO.println("Login realizado com sucesso");
        }
        if (usuario  != usuarioCorreto & senha != senhaCorreta) {
            IO.println("Usuario ou senha incoreta");


        }
        }
    }
