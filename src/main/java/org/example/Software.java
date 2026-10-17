package org.example;

public class Software {
    private String nome;
    private int versao;

    public Software(String nome, int versao) {
        this.nome = nome;
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public int getVersao() {
        return versao;
    }

    public void atualizarVersao(int novaVersao) {
        this.versao = novaVersao;
    }
}
