package edu.dio.bancodigital.dominio;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Cliente {


    private final long id;
    private String email, senha;


    public Cliente() {
        this.id = ThreadLocalRandom.current().nextLong(0, 1_000_000);
    }


    public Cliente(String email, String senha) {
        this();
        this.email = email;
        this.senha = senha;
    }


    @Override
    public String toString() {
        return String.format("%s%n---------------%n%s: %d%n%s: %s%n%s: %s%n", "CADASTRO", "ID", getId(), "E-mail", getEmail(), "Senha",
                getSenha());
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
