package br.com.banco.controller;

import br.com.banco.model.Cliente;
import br.com.banco.model.ContaCorrente;
import br.com.banco.service.Banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "12345678900");
        ContaCorrente conta1 = new ContaCorrente("001", cliente1, 1000);

        Cliente cliente2 = new Cliente("Maria Oliveira", "09876543211");
        ContaCorrente conta2 = new ContaCorrente("002", cliente2, 500);

        Banco banco = new Banco();
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(200);
        conta1.transferir(150, conta2);

        System.out.println("Saldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());
    }
}
