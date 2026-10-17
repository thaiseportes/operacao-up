package org.example;

public abstract class Dispositivo {

    private String modelo;

    public Dispositivo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void buscarAtualizacao(ServidorAtualizacao servidor);
}