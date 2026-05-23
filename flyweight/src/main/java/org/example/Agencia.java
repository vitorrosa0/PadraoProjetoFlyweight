package org.example;

public class Agencia {

    private Integer nuAgencia;
    private String nomeAgencia;

    public Agencia(Integer nuAgencia, String nomeAgencia) {
        this.nuAgencia = nuAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    public Integer getNuAgencia() {
        return nuAgencia;
    }

    public String getNome() {
        return nomeAgencia;
    }
}
