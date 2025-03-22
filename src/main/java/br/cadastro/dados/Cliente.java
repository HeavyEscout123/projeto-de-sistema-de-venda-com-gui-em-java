package br.cadastro.dados;

import com.google.gson.annotations.SerializedName;

import java.util.Random;


public class Cliente{
    @SerializedName("nome")
    private String nome;

    @SerializedName("codigo")
    private  int codigo;

    private static Random r = new Random ();

    public Cliente(Pessoa a){
        this.nome = a.getNome();
        this.codigo = r.nextInt (101);

    }
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }


    public String toString() {
        return "Nome: " +nome+ " codigo: "+codigo;
    }
}