package entities;

import java.math.BigDecimal;

public class Refrigerante {

    private String descricao;
    private BigDecimal valor;

    public Refrigerante() {

    }
    public Refrigerante(TipoRefrigerante tipoRefrigerante) {
        this.descricao = tipoRefrigerante.getDescricao();
        this.valor = tipoRefrigerante.getValor();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}
