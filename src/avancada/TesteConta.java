package avancada;

public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Vitor Fornaciari", 1000);

        conta.exibirSaldo();

        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(2000);
        conta.depositar(-50);
        conta.sacar(-30);

        conta.exibirSaldo();
    }
}
