package edu.dio.bancodigital.dominio;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Cliente {


    private final long id;
    private String email, senha;


    public Cliente() {
        this.id = ThreadLocalRandom.current().nextLong();
    }


    public Cliente(String email, String senha) {
        super();
        this.email = email;
        this.senha = senha;
    }

    public abstract void cadastrarCliente();

    public void signUp () {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu endereço de e-mail: ");
        setEmail(input.nextLine());
        System.out.println("Digite sua senha: ");
        String senha = input.nextLine();
        System.out.println("Digite sua senha novamente para confirmação: ");
        String confirmaSenha = input.nextLine();
        if (confirmaSenha.equals(senha)) setSenha(senha); else  {
            System.out.println("A senha digitada não coincide com a senha anterior");
            signUp();
        }




    }



    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
