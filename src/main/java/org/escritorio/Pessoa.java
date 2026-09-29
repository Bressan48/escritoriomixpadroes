package org.escritorio;

abstract class Pessoa {

    protected Procuracao procuracao;
    protected Contrato contrato;

    protected float custoBase;

    public Pessoa(float custoBase) {
        this.custoBase = custoBase;
    }

    public void setProcuracao(Procuracao procuracao) {
        this.procuracao = Pessoa.this.procuracao;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = Pessoa.this.contrato;
    }

    public void setCustoBase(float custoBase) {
        this.custoBase = custoBase;
    }

    public abstract float calcularCusto();
}
