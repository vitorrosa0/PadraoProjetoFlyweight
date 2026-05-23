package org.example;

public class Conta {

    private int nuConta;
    private Agencia agencia;

    public Conta(int nuConta, Agencia agencia) {
        this.nuConta = nuConta;
        this.agencia = agencia;
    }

    public String obterConta() {
        return "Conta{" +
                "numero=" + nuConta +
                ", agencia='" + agencia.getNome() + "'" +
                ", numeroAgencia=" + agencia.getNuAgencia() +
                '}';
    }
}
