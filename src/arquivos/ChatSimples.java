package arquivos;

import java.util.Scanner;

public class ChatSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mensagens = new String[10];

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        System.out.println("\n--- Início da Conversa ---");

        for (int i = 0; i < 10; i++) {
            String remetente = (i % 2 == 0) ? usuario1 : usuario2;

            System.out.print(remetente + ", digite sua mensagem: ");
            String mensagem = scanner.nextLine();

            mensagens[i] = remetente + ": " + mensagem;
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (String msg : mensagens) {
            System.out.println(msg);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");

        scanner.close();
    }
}
