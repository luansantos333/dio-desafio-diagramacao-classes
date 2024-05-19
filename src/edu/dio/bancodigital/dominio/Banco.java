package edu.dio.bancodigital.dominio;

import edu.dio.bancodigital.exception.SetVazioException;

import java.util.Optional;
import java.util.SortedSet;

public class Banco {


    private int id_banco;
    private String nome;
    private Optional<SortedSet<Conta>> contas;


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


    public Optional<SortedSet<Conta>> getContas() {
        return contas;
    }

    public void setContas(Optional<SortedSet<Conta>> contas) {
        this.contas = contas;
    }

    public void imprimirTodasContas () {


        if (getContas().isPresent()) {

            for (Conta conta : getContas().get()) {
                System.out.println("======= DADOS CONTAS =======");
                conta.imprimirExtrato();
                System.out.println("===== DADOS CADASTRO =======");
                conta.imprimirDadosCliente();

            }

        } else {


            try {
                getContas().orElseThrow(() -> new SetVazioException("Nenhuma conta cadastrada"));
            } catch (SetVazioException e) {
                throw new RuntimeException(e);
            }


        }


    }




}
