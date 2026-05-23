package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    @Test
    void deveRetornarContas() {
        Banco banco = new Banco();
        banco.cadastrar(1001,"Agencia Centro", 101);
        banco.cadastrar(1002, "Agencia Centro", 101);
        banco.cadastrar(1003, "Agencia Centro", 101);
        banco.cadastrar(1004, "Agencia Sul", 102);

        List<String> saida = Arrays.asList(
                "Conta{numero=1001, agencia='Agencia Centro', numeroAgencia=101}",
                "Conta{numero=1002, agencia='Agencia Centro', numeroAgencia=101}",
                "Conta{numero=1003, agencia='Agencia Centro', numeroAgencia=101}",
                "Conta{numero=1004, agencia='Agencia Sul', numeroAgencia=102}");

        assertEquals(saida, banco.obterContas());
    }

    @Test
    void deveRetornarTotalAgencias() {
        Banco banco = new Banco();
        banco.cadastrar(1001, "Agencia Centro", 101);
        banco.cadastrar(1002, "Agencia Centro", 101);
        banco.cadastrar(1003,  "Agencia Centro", 101);
        banco.cadastrar(1004,  "Agencia Sul", 102);

        assertEquals(2, AgenciaFactory.getTotalAgencias());
    }
}