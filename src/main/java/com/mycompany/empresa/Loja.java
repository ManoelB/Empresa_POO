package com.mycompany.empresa;


import com.mycompany.empresa.Vendedor;

public class Loja {
    private String nome;
    private String ramo;
    private int anoFundacao;
    private Vendedor vendedor;

    public Loja(String nome, String ramo, int anoFundacao) {
        this.nome = nome;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }

    public String getRamo() {
        return ramo;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void admitirVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        System.out.println(vendedor.getNome() + " foi admitido na loja " + nome);
    }

    public void demitirVendedor() {
        System.out.println(vendedor.getNome() + " foi demitido da loja " + nome);
        this.vendedor = null;
    }
}
