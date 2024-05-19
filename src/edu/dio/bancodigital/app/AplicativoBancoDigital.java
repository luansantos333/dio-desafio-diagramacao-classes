package edu.dio.bancodigital.app;

import edu.dio.bancodigital.dominio.*;
import edu.dio.bancodigital.exception.SetVazioException;

import java.util.*;

public class AplicativoBancoDigital {


    public static void main(String[] args) {

        Banco bancoDigital = new Banco();
        Conta c1 = new ContaCorrente(new ClientePF("192.857.578-91", "Pedro", "Santos Souza", "2189751133", "pedrinho@gmail.com", "123456789"));
        Conta c2 = new ContaCorrente(new ClientePF("192.810.578-91", "Maria", "Louise Vitória", "2189751345", "maria@gmail.com", "123456789"));
        Conta c3 = new ContaPoupanca(new ClientePF("192.811.578-91", "Ana Cláudia", "D'Annunzio Copolla", "2189751221", "anaclaudia@gmail.com", "123456789"));

        c1.depositar(100);
        c1.sacar(10);
        c1.transferir(20, c2);
        c3.depositar(1000);

        bancoDigital.setContas(new ArrayList<>(List.of(c1, c2, c3)));


        try {
            bancoDigital.imprimirTodasContas();
        } catch (SetVazioException e) {
            throw new RuntimeException(e);
        }


    }
}
