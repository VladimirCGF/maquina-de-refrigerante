package entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


public class Venda {
    private BigDecimal valorVenda;
    private BigDecimal valorInserido;
    private BigDecimal valorTroco;
    private String produto;
    private LocalDateTime date;

    public Venda() {
    }

    public Venda(BigDecimal valorVenda, BigDecimal valorInserido, BigDecimal valorTroco, String produto, LocalDateTime date) {
        this.valorVenda = valorVenda;
        this.valorInserido = valorInserido;
        this.valorTroco = valorTroco;
        this.produto = produto;
        this.date = date;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public BigDecimal getValorInserido() {
        return valorInserido;
    }

    public void setValorInserido(BigDecimal valorInserido) {
        this.valorInserido = valorInserido;
    }

    public BigDecimal getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(BigDecimal valorTroco) {
        this.valorTroco = valorTroco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
