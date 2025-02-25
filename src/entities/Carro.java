package entities;

public class Carro extends Veiculo {
    private String tipoCarro;
    private double consumoCombustivel;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro, double consumoCombustivel) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public double calcularAutonomia() {
        double capacidadeTanque = 50;
        return capacidadeTanque * consumoCombustivel;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de Carro: " + tipoCarro);
        System.out.println("Consumo de combustivel: " + consumoCombustivel + " km/l");
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }


}