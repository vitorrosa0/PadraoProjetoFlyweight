package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas = new ArrayList<>();

    public void cadastrar(int nuConta, String nomeAgencia, Integer nuAgencia) {
        Agencia agencia = AgenciaFactory.getAgencia(nuAgencia, nomeAgencia);
        Conta conta = new Conta(nuConta, agencia);
        contas.add(conta);
    }

    public List<String> obterContas() {
        List<String> saida = new ArrayList<>();
        for (Conta conta : contas) {
            saida.add(conta.obterConta());
        }
        return saida;
    }
}
