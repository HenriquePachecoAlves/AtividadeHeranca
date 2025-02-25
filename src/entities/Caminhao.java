package entities;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private double consumoCombustivel;
    
    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double consumoCombustivel) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public double calcularAutonomia() {
        double capacidadeTanque = 300;
        return capacidadeTanque * consumoCombustivel;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo = Caminhao");
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
        System.out.println("Consumo de Combustivel: " + consumoCombustivel + " km/l");
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }


}