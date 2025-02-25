package Entitites;

public class ContaSalario extends ContaCorrente {
    private int saquesGratuitosRestantes;

    public ContaSalario(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial, limiteChequeEspecial);
        this.saquesGratuitosRestantes = 1;
    }

    @Override
    public void sacar(double valor) {
        double taxa = 0.0;
        if (saquesGratuitosRestantes <= 0) {
            taxa = 5.0;
        }

        double valorTotal = valor + taxa;
        double saldoDisponivel = saldo + limiteChequeEspecial;

        if (valor > 0 && valorTotal <= saldoDisponivel) {
            saldo -= valorTotal;
            saquesGratuitosRestantes--;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa: R$ " + taxa);
        } else {
            System.out.println("Saldo insuficiente para o saque de R$ " + valor + ".");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Saques gratuitos restantes: " + saquesGratuitosRestantes);
    }
}
