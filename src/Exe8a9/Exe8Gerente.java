package Exe8a9;

public class Exe8Gerente extends Exe8Funcionario {

    public Exe8Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 1.20; // bônus de 20%
    }
}
