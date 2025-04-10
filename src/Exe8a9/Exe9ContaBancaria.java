package Exe8a9;

public class Exe9ContaBancaria {
    public String titular;
    private double saldo;

    public Exe9ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        }
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s | Saldo atual: R$ %.2f\n", titular, saldo);
    }
}
