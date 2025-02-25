package Entitites;

public abstract class ContaBancaria {
    private String numeroConta;
    private String titular;
    protected double saldo;


    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de deposito invalido. O valor deve ser maior que zero.");
        }
    }

    public abstract void sacar(double valor);

    public void exibirInformacoes() {
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }


}