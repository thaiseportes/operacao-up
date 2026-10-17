package org.example;

public class ServidorAtualizacao {

    private int versaoDisponivel;
    private String linkDownload;

    public ServidorAtualizacao(int versaoDisponivel, String linkDownload) {
        this.versaoDisponivel = versaoDisponivel;
        this.linkDownload = linkDownload;
    }

    public boolean temAtualizacao(int versaoAtual) {
        return versaoDisponivel > versaoAtual;
    }

    public int getVersaoDisponivel() {
        return versaoDisponivel;
    }

    public String getLinkDownload() {
        return linkDownload;
    }
}
