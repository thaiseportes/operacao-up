package org.example;

public class Televisao extends Dispositivo {

    private Software software;

    public Televisao(String modelo, Software software) {
        super(modelo);
        this.software = software;
    }

    public Software getSoftware() {
        return software;
    }

    @Override
    public void buscarAtualizacao(ServidorAtualizacao servidor) {

        System.out.println("Verificando atualização...");

        if (servidor.temAtualizacao(software.getVersao())) {

            System.out.println("Nova versão disponível!");
            System.out.println("Versão atual: " + software.getVersao());
            System.out.println("Nova versão: " + servidor.getVersaoDisponivel());
            System.out.println("Baixando atualização...");
            System.out.println("Link: " + servidor.getLinkDownload());

            software.atualizarVersao(servidor.getVersaoDisponivel());

            System.out.println("Atualização concluída!");
            System.out.println("Versão atual da TV: " + software.getVersao());

        } else {

            System.out.println("A TV já está atualizada.");

        }
    }
}
