package Exe10a12;

import java.util.*;

public class Exe11Loteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numerosSorteados = new HashSet<>();
        Set<Integer> palpitesUsuario = new HashSet<>();

        Random random = new Random();

        while (numerosSorteados.size() < 6) {
            int numero = random.nextInt(60) + 1; // entre 1 e 60
            numerosSorteados.add(numero);
        }

        System.out.println("Digite 6 números entre 1 e 60 (sem repetir):");

        while (palpitesUsuario.size() < 6) {
            System.out.print("Número " + (palpitesUsuario.size() + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido. Tente entre 1 e 60.");
            } else if (palpitesUsuario.contains(numero)) {
                System.out.println("Número repetido. Digite outro.");
            } else {
                palpitesUsuario.add(numero);
            }
        }


        System.out.println("\nNúmeros sorteados: " + numerosSorteados);
        System.out.println("Seus palpites: " + palpitesUsuario);

        Set<Integer> acertos = new HashSet<>(palpitesUsuario);
        acertos.retainAll(numerosSorteados);

        System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);

        scanner.close();
    }
}
