package com.mycompany.empresa;

public class Vendedor {
    private String nome;
    private int idade;

    public Vendedor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void vender() {
        System.out.println(nome + " está vendendo.");
    }
}
