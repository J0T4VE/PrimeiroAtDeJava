package conceitos;

import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal (R$): ");
        double salarioMensal = scanner.nextDouble();

        double salarioAnual = salarioMensal * 12;
        double imposto = 0;

        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        double salarioLiquido = salarioAnual - imposto;

        System.out.println("\nNome: " + nome);
        System.out.printf("Salário Anual: R$ %.2f\n", salarioAnual);
        System.out.printf("Imposto Devido: R$ %.2f\n", imposto);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);

        scanner.close();
    }
}
