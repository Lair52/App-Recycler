package com.example.recycler.act.model;

public class WindBlade {
    String numeracao;
    String set;
    String saida;

    public WindBlade(){
    }
    public WindBlade(String numeracao, String set, String saida) {
        this.numeracao = numeracao;
        this.set = set;
        this.saida = saida;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
}
