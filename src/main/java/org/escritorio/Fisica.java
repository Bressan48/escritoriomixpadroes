package org.escritorio;

public class Fisica extends Pessoa{

    public Fisica(float custoBase) {
        super(custoBase);
    }

    public float calcularCusto() {
        return this.custoBase * (1 + this.contrato.percentualAumento() + this.procuracao.percentualAumento());
    }

}
