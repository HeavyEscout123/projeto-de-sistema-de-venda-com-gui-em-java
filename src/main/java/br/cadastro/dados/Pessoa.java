package br.cadastro.dados;

import com.google.gson.annotations.SerializedName;

public class Pessoa {
@SerializedName("nome")
private String nome;
@SerializedName("cpf")
private String cpf;

public Pessoa(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;

}

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String toString () {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
