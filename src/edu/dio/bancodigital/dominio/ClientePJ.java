package edu.dio.bancodigital.dominio;


public class ClientePJ extends Cliente {

    private String nome_empresa, nome_responsavel, numero_telefone;
    private String cpnj;


    public ClientePJ() {

        super();
    }

    public ClientePJ(String email, String senha, String nome_empresa, String nome_responsavel, String numero_telefone, String cpnj) {
        super(email, senha);
        this.nome_empresa = nome_empresa;
        this.nome_responsavel = nome_responsavel;
        this.numero_telefone = numero_telefone;
        this.cpnj = cpnj;
    }



    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public String getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    @Override
    public String toString() {
        return String.format("%s%s: %s%n%s: %s%n%s: %s%n%s: %s%n", super.toString(), "Empresa", getNome_empresa(), "Responsável", getNome_responsavel(),
                "CNPJ", getCpnj(), "Contato", getNumero_telefone());
    }

}
