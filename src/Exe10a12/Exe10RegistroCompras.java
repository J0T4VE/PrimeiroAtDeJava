package Exe10a12;

import java.io.*;
import java.util.Scanner;

public class Exe10RegistroCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "compras.txt";

        try {
            FileWriter writer = new FileWriter(nomeArquivo);

            for (int i = 1; i <= 3; i++) {
                System.out.println("Compra " + i);

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Preço unitário: ");
                double preco = Double.parseDouble(scanner.nextLine());

                writer.write("Produto: " + produto + "\n");
                writer.write("Quantidade: " + quantidade + "\n");
                writer.write("Preço unitário: R$ " + String.format("%.2f", preco) + "\n");
                writer.write("-----------------------------\n");
            }

            writer.close();
            System.out.println("\nDados salvos com sucesso em " + nomeArquivo + "!\n");

        } catch (IOException e) {
            System.out.println("Erro ao salvar as compras: " + e.getMessage());
        }

        // Leitura do arquivo
        System.out.println("=== Compras Registradas ===");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
