package org.escritorio;

public interface Procuracao {
    String emitir();

    public default float percentualAumento() {
        return 0.2f;
    }
}
