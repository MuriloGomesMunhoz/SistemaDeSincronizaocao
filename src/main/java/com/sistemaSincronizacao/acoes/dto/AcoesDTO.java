package com.sistemaSincronizacao.acoes.dto;

public class AcoesDTO {
    private Long id;
    private String nomeOrder;
    private int qtdOrder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeOrder() {
        return nomeOrder;
    }

    public void setNomeOrder(String titulo) {
        this.nomeOrder = titulo;
    }

    public int getQtdOrder() {
        return qtdOrder;
    }

    public void setQtdOrder(int qtdOrder) {
        this.qtdOrder = qtdOrder;
    }
}
