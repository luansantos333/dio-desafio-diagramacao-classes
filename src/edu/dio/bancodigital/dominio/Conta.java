package edu.dio.bancodigital.dominio;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    @Override
    public void imprimirDadosCliente() {
        if (cliente instanceof ClientePF clientePF) System.out.println(clientePF.toString());
        else if (cliente instanceof ClientePJ clientePJ) System.out.println(clientePJ.toString());
    }

    @Override
    public void imprimirExtrato() {

        if (this.cliente instanceof ClientePF) {

            ClientePF clientePF = (ClientePF) this.cliente;

            System.out.println(String.format("Titular: %s", clientePF.getNome()));
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));

        } else if (this.cliente instanceof ClientePJ) {

            ClientePJ clientePJ = (ClientePJ) this.cliente;

            System.out.println(String.format("Titular: %s", clientePJ.getNome_empresa()));
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));


        }

    }






}



