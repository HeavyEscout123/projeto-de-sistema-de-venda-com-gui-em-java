package br.cadastro.dados;

import com.google.gson.annotations.SerializedName;

import java.util.Random;

public class Produto {
    @SerializedName("codigo")
    private final int codigo;

    private static Random r = new Random ();

    @SerializedName("nome")
    private String nome;

    @SerializedName("preço")
    private double preco;

public Produto(String nome, double preco){
        this.codigo = r.nextInt (101);
        this.nome = nome;
        this.preco = preco;

}

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }


    public String toString() {
        return "Preco: "+preco+"\nNome: "+nome+"\nCodigo: "+codigo+"\n------\n";
    }
}
