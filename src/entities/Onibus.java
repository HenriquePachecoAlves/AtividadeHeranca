package entities;

public class Onibus extends Veiculo {
    private int quantidadeEixos;
    private double consumoCombustivel;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos, double consumoCombustivel) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);

        this.quantidadeEixos = quantidadeEixos;
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public double calcularAutonomia() {
        double capacidadeTanque = 200;
        return capacidadeTanque * consumoCombustivel;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Onibus");
        System.out.println("Quantidade de Eixos: " + quantidadeEixos);
        System.out.println("Consumo de Combustivel: " + consumoCombustivel + " km/l");
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }

}