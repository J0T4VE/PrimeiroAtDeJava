package Exe8a9;

public class Exe8Estagiario extends Exe8Funcionario {

    public Exe8Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 0.90; // desconto de 10%
    }
}
