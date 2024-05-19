package edu.dio.bancodigital.dominio;

import java.time.LocalDate;
import java.util.Scanner;

public class ClientePF extends Cliente{

    private String nome, sobrenome, numero_telefone;
    private final String cpf;
    private LocalDate data_nascimento;


    public ClientePF() {
        super();
    }

    public ClientePF(String email, String senha, String nome, String sobrenome, String numero_telefone, String cpf, LocalDate data_nascimento) {
        super(email, senha);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero_telefone = numero_telefone;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }


    @Override
    public void cadastrarCliente() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        setNome(entrada.nextLine());
        System.out.println("Digite seu sobrenome: ");
        setSobrenome(entrada.nextLine());
        String



    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
