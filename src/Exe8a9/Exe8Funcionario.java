package Exe8a9;

 class Exe8Funcionario {
    protected String nome;
    protected double salarioBase;

    public Exe8Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioFinal() {
        return salarioBase; // Na base, não altera o salário
    }

    public void exibirSalario() {
        System.out.printf("Funcionário: %s | Salário Final: R$ %.2f\n", nome, calcularSalarioFinal());
    }
}
