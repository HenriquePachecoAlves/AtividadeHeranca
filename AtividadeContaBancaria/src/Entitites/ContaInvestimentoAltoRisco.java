package Entitites;

public class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double SALDO_MINIMO = 10000.0;

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxaRetirada = valor * 0.05;
        double valorTotal = valor + taxaRetirada;

        if (valor > 0 && valorTotal <= saldo && saldo >= SALDO_MINIMO) {
            saldo -= valorTotal;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de retirada: R$ " + taxaRetirada);
        } else {
            System.out.println("Saldo insuficiente ou abaixo do minimo exigido para o saque de R$ " + valor);
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Saldo minimo exigido para saque: R$ " + SALDO_MINIMO);
    }
}
