package br.cadastro.bancoD;

import br.cadastro.dados.Cliente;
import br.cadastro.dados.Produto;

import java.util.*;

public class Venda {
private Cliente cli;
ArrayList<itemVenda>itemV;

    public Venda(Cliente cli){
        this.cli = cli;
        this.itemV = new ArrayList<>();
    }

    public void inserir(itemVenda a){
    itemV.add(a);

    }

    public double valorTotal(){
        double res = 0;
        for (itemVenda a : itemV) {
            res += a.getValor();
        }
    return res;
    }

    public String toString(){
        StringBuilder x = new StringBuilder();
        for (itemVenda a : itemV) {
            x.append(a.toString());
        }

        return "Nome do Cliente: "+cli.getNome()+" \nItens Comprados e quantidade: "+x;

        }
    }


