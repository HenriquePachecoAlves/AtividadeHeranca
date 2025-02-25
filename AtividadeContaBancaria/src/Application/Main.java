package Application;

import Entitites.*;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("12345", "João Silva", 1000.0, 500.0);
        System.out.println(" <><><> Conta Corrente <><><> ");
        contaCorrente.exibirInformacoes();
        contaCorrente.depositar(200.0);
        contaCorrente.sacar(1500.0);
        contaCorrente.sacar(2000.0);
        contaCorrente.exibirInformacoes();
        System.out.println();


        ContaPoupanca contaPoupanca = new ContaPoupanca("67890", "Maria Oliveira", 3000.0);
        System.out.println(" <><><> Conta Poupança <><><> ");
        contaPoupanca.exibirInformacoes();
        contaPoupanca.sacar(2500.0);
        contaPoupanca.sacar(1000.0);
        contaPoupanca.exibirInformacoes();
        System.out.println();


        ContaInvestimento contaInvestimento = new ContaInvestimento("54321", "Carlos Souza", 5000.0);
        System.out.println(" <><><> Conta Investimento <><><> ");
        contaInvestimento.exibirInformacoes();
        contaInvestimento.sacar(1000.0);
        contaInvestimento.sacar(5000.0);
        contaInvestimento.exibirInformacoes();
        System.out.println();


        ContaSalario contaSalario = new ContaSalario("98765", "Ana Costa", 2000.0, 1000.0);
        System.out.println(" <><><> Conta Salário <><><> ");
        contaSalario.exibirInformacoes();
        contaSalario.sacar(500.0);
        contaSalario.sacar(300.0);
        contaSalario.exibirInformacoes();
        System.out.println();


        ContaInvestimentoAltoRisco contaInvestimentoAltoRisco = new ContaInvestimentoAltoRisco("11223", "Pedro Alves", 15000.0);
        System.out.println(" <><><> Conta Investimento de Alto Risco <><><> ");
        contaInvestimentoAltoRisco.exibirInformacoes();
        contaInvestimentoAltoRisco.sacar(2000.0);
        contaInvestimentoAltoRisco.sacar(5000.0);
        contaInvestimentoAltoRisco.sacar(10000.0);
        contaInvestimentoAltoRisco.exibirInformacoes();
    }
}