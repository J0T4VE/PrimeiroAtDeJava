package avancada;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carla", 5000);
        Estagiario estagiario = new Estagiario("Lucas", 2000);

        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}
