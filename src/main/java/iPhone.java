package main.java;

import main.java.interfaces.AparelhoTelefonico;
import main.java.interfaces.NavegadorInternet;
import main.java.interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private String numeroSerie;
    private boolean atendida = false;


    public iPhone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        atendida = true;
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void desligar() {
        if (atendida) {
            System.out.println("Desligando o telefone...");
        } else {
            System.out.println("Você não estava em chamada.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public static void main(String[] args) {
        System.out.println("=========Iniciando Iphone=========");
        iPhone meuIphone = new iPhone("iPhone X", "1234567890");
        System.out.println("Modelo do iPhone: " + meuIphone.getModelo()+ "\nSérie: "+ meuIphone.getNumeroSerie());

        // Teste das funcionalidades do Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Counting My Blessings - Seph Schlueter");

        // Teste das funcionalidades do Aparelho Telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste das funcionalidades do Navegador na Internet
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
