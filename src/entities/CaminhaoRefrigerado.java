package entities;

public class CaminhaoRefrigerado extends Caminhao {
    private double temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double consumoCombustivel, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga, consumoCombustivel);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia() {
        double autonomiaBase = super.calcularAutonomia();
        return autonomiaBase * 0.9;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Caminhão Refrigerado");
        System.out.println("Temperatura Mínima: " + temperaturaMinima + " °C");
        System.out.println("Autonomia (com redução de 10%): " + calcularAutonomia() + " km");
    }

}