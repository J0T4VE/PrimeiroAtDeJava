package Exe2a4;

import java.util.Scanner;

public class Exe4SimuladorEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo (R$): ");
        double valor = scanner.nextDouble();

        System.out.print("Digite o número de parcelas (entre 6 e 48): ");
        int parcelas = scanner.nextInt();

        if (parcelas < 6 || parcelas > 48) {
            System.out.println("Número de parcelas inválido. Deve ser entre 6 e 48.");
        } else {
            double jurosMensal = 0.03;
            double valorTotal = valor * Math.pow(1 + jurosMensal, parcelas);
            double valorParcela = valorTotal / parcelas;

            System.out.println("\nCliente: " + nome);
            System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
            System.out.printf("Valor da parcela (%dx): R$ %.2f\n", parcelas, valorParcela);
        }

        scanner.close();
    }
}
