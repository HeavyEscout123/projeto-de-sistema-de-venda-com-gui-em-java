package br.cadastro.dados;

import com.google.gson.annotations.SerializedName;

import java.util.Random;


public class Cliente extends Pessoa{
    @SerializedName("codigo")
    private  int codigo;

    private static Random r = new Random ();

    public Cliente(String nome,String cpf){
        super(nome,cpf);
        this.codigo = r.nextInt (101);

    }
    public int getCodigo() {
        return codigo;
    }

}