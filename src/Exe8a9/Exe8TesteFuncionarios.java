package Exe8a9;

public class Exe8TesteFuncionarios {
    public static void main(String[] args) {
        Exe8Gerente gerente = new Exe8Gerente("Carla", 5000);
        Exe8Estagiario estagiario = new Exe8Estagiario("Lucas", 2000);

        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}
