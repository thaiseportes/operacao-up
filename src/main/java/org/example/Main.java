package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Software software = new Software("Sistema da TV", 1);

        Televisao tv = new Televisao("Smart TV", software);

        ServidorAtualizacao servidor =
                new ServidorAtualizacao(
                        2,
                        "www.empresa.com/atualizacao-v2"
                );

        tv.buscarAtualizacao(servidor);
    }
}
