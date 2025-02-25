package application;

import entities.*;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 5, "Gasolina", "sedan", 12.0);
        System.out.println("Detalhes do carro");
        carro.exibirDetalhes();
        System.out.println();

        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2019, 2, "Diesel", 40.0, 6.0);
        System.out.println("Detalhes do caminhao");
        caminhao.exibirDetalhes();
        System.out.println();


        Onibus onibus = new Onibus("Mercedes", "O500", 2018, 50, "Diesel", 6, 5.0);
        System.out.println("Detalhes do onibus");
        onibus.exibirDetalhes();
        System.out.println();


        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, "Elétrico", "sedan", 75.0);
        System.out.println("Detalhes do carro eletrico");
        carroEletrico.exibirDetalhes();
        System.out.println();

        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Volvo", "FH16", 2022, 2, "Diesel", 40.0, 6.0, -20.0);
        System.out.println("Detalhes do caminhao refrigerado");
        caminhaoRefrigerado.exibirDetalhes();
    }
}