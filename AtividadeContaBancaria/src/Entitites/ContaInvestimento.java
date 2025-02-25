package Entitites;

public class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxaRetirada = valor * 0.02; // Taxa de 2%
        double valorTotal = valor + taxaRetirada;
        if (valor > 0 && valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de retirada: R$ " + taxaRetirada);
        } else {
            System.out.println("Saldo insuficiente para o saque de R$ " + valor);
        }
    }
}