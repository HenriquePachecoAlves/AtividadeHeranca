package entities;

public class CarroEletrico extends Carro {
    private double bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro, 0);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        double consumoPorKWh = 5;
        return bateriaKWh * consumoPorKWh;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Carro Eletrico");
        System.out.println("Capacidade da Bateria: " + bateriaKWh + " kWh");
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }


}