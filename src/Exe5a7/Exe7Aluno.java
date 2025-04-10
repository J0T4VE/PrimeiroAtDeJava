package Exe5a7;

import java.util.Scanner;

public class Exe7Aluno {
    String nome;
    String matricula;
    double nota1, nota2, nota3;

    public Exe7Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.printf("Média: %.2f\n", media);
        if (media >= 7) {
            System.out.println("Situação: Aprovado ✅");
        } else {
            System.out.println("Situação: Reprovado ❌");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        Exe7Aluno aluno = new Exe7Aluno(nome, matricula, nota1, nota2, nota3);

        System.out.println("\n=== Resultado ===");
        aluno.verificarAprovacao();

        scanner.close();
    }
}
