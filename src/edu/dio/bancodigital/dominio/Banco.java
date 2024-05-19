package edu.dio.bancodigital.dominio;

import edu.dio.bancodigital.exception.SetVazioException;

import java.util.List;



public class Banco {


    private int id_banco;
    private String nome;
    private List<Conta> contas;


    public int getId_banco() {
        return id_banco;
    }

    public void setId_banco(int id_banco) {
        this.id_banco = id_banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void imprimirTodasContas () throws SetVazioException {


        if (!getContas().isEmpty()) {

            for (Conta conta : getContas()) {
                System.out.println("======= DADOS CONTAS =======");
                conta.imprimirExtrato();
                System.out.println("===== DADOS CADASTRO =======");
                conta.imprimirDadosCliente();

            }

        } else {

            throw new SetVazioException("Não há contas cadastradas!");

        }


    }




}
