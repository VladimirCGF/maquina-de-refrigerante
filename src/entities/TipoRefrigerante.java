package entities;

import java.math.BigDecimal;

public enum TipoRefrigerante {
    COCA_COLA("Coca-Cola",BigDecimal.valueOf(10.00)),
    PEPSI("Pepsi",BigDecimal.valueOf(8.00)),
    FANTA("Fanta",BigDecimal.valueOf(7.00)),
    SPRITE("Sprite",BigDecimal.valueOf(6.00));


    private final String descricao;
    private final BigDecimal valor;

    TipoRefrigerante(String descricao,BigDecimal valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
