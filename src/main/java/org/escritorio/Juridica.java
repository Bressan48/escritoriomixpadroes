package org.escritorio;

public class Juridica extends Pessoa {

    public Juridica(float custoBase) {
        super(custoBase);
    }

    public float calcularCusto() {
        return this.custoBase * (1 + this.contrato.percentualAumento() + this.procuracao.percentualAumento());
    }
}
