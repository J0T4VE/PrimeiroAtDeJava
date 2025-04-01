package conceitos;

import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String senha;
        boolean senhaValida = false;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        while (!senhaValida) {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            if (senha.length() < 8) {
                System.out.println("Erro: A senha deve ter no mínimo 8 caracteres.");
            } else if (!senha.matches(".*[A-Z].*")) {
                System.out.println("Erro: A senha deve conter pelo menos uma letra maiúscula.");
            } else if (!senha.matches(".*\\d.*")) {
                System.out.println("Erro: A senha deve conter pelo menos um número.");
            } else if (!senha.matches(".*[@#$%^&+=!].*")) {
                System.out.println("Erro: A senha deve conter pelo menos um caractere especial (@, #, $, etc.).");
            } else {
                senhaValida = true;
                System.out.println("Senha válida! Cadastro realizado com sucesso, " + nome + "!");
            }
        }

        scanner.close();
    }
}
