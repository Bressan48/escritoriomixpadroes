package org.escritorio;

public interface Contrato {

    String emitir();

    public default float percentualAumento() {
        return 0.1f;
    }
}
