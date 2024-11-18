package br.com.banco.model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (getSaldo() + limite >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getLimite() {
        return limite;
    }
}
