package edu.dio.bancodigital.dominio;


public class ClientePF extends Cliente{

    private String nome, sobrenome, numero_telefone;
    private  String cpf;

    public ClientePF() {
        super();
    }

    public ClientePF(String email, String senha, String nome, String sobrenome, String numero_telefone, String cpf) {
        super(email, senha);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero_telefone = numero_telefone;
        this.cpf = cpf;

    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
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


    @Override
    public String toString() {

        return String.format("%s%s %s%n%s: %s%n%s: %s%n%s: %s%n", super.toString(), "Nome", getNome(), "Sobrenome", getSobrenome(), "CPF", getCpf(),
                "Contato", getNumero_telefone());

    }
}
