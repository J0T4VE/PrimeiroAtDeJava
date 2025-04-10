package Exe8a9;

public class Exe9TesteConta {
    public static void main(String[] args) {
        Exe9ContaBancaria conta = new Exe9ContaBancaria("João Vitor Fornaciari", 1000);

        conta.exibirSaldo();

        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(2000);
        conta.depositar(-50);
        conta.sacar(-30);

        conta.exibirSaldo();
    }
}
