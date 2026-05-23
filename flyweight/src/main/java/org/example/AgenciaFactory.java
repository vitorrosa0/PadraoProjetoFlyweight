package org.example;

import java.util.HashMap;
import java.util.Map;

public class AgenciaFactory {

    private static Map<Integer, Agencia> agencias = new HashMap<>();

    public static Agencia getAgencia(Integer nuAgencia, String nomeAgencia) {
        Agencia agencia = agencias.get(nuAgencia);
        if (agencia == null) {
            agencia = new Agencia(nuAgencia, nomeAgencia);
            agencias.put(nuAgencia, agencia);
        }

        return agencia;
    }

    public static int getTotalAgencias() {
        return agencias.size();
    }
}
