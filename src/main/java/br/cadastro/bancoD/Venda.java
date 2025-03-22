package br.cadastro.bancoD;

import br.cadastro.dados.Cliente;
import br.cadastro.dados.Produto;

import java.util.*;

public class Venda {
private Cliente cli;
ArrayList<Produto> item;
ArrayList<itemVenda>itemV;

    public Venda(Cliente cli){
        this.item = new ArrayList<>();
        this.cli = cli;
        this.itemV = new ArrayList<>();
    }
    public void inserir(Produto prod){
        item.add(prod);

    }
    public void inserir(itemVenda a){
    itemV.add(a);

    }

    public double valorTotal(){
        double res = 0;

        for(int i =0; i<itemV.size();i++){
        itemVenda a = itemV.get(i);
        res += a.getValor();
    }
    return res;
    }

    public String toString(){
        StringBuilder x = new StringBuilder();
        for(int i =0;i< itemV.size();i++) {
            itemVenda a = itemV.get(i);
            x.append(a.toString());
        }

        return "Nome do br.cadastro.dados.Cliente: "+cli.getNome()+" Itens Comprados e quantidade: "+" "+x;

        }
    }


