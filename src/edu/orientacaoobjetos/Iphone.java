package edu.orientacaoobjetos;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{


    @Override
    public void ligar() {

        System.out.println("Ligando...");

    }

    @Override
    public void atender() {

        System.out.println("Atendendo telefone...");


    }

    @Override
    public void iniciarCorreioDeVoz() {

        System.out.println("Iniciando correio de voz...");


    }


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");

    }

    @Override
    public void adicionarNovaAba() {


        System.out.println("Exibindo nova aba...");


    }

    @Override
    public void atualizarPagina() {


        System.out.println("Atualizando pagina...");

    }

    @Override
    public void tocar() {

        System.out.println("Tocando música...");


    }

    @Override
    public void pausar() {

        System.out.println("Pausando musica...");


    }

    @Override
    public void selecionarMusica() {


        System.out.println("Selecionando musica...");

    }
}
