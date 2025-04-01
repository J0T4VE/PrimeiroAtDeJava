package classes;

public class Veiculo {
    String placa;
    String modelo;
    int anoFabricacao;
    double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }

    public void registrarViagem(double km) {
        this.quilometragem += km;
        System.out.println("Viagem registrada. Quilometragem atual: " + quilometragem + " km");
    }

    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("ABC1234", "Gol", 2015, 50000);
        Veiculo carro2 = new Veiculo("XYZ5678", "Onix", 2020, 30000);

        System.out.println("\n--- Detalhes do Carro 1 ---");
        carro1.exibirDetalhes();
        carro1.registrarViagem(150);

        System.out.println("\n--- Detalhes do Carro 2 ---");
        carro2.exibirDetalhes();
        carro2.registrarViagem(220);
    }
}
