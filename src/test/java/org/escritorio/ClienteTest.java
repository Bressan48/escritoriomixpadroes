package org.escritorio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Jurídica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Jurídica", cliente.emitirProcuracao());
    }

}
