package br.cadastro;


import br.cadastro.bancoD.CadClientes;
import br.cadastro.bancoD.CadProdutos;
import br.cadastro.bancoD.Venda;
import br.cadastro.bancoD.itemVenda;
import br.cadastro.dados.Cliente;
import br.cadastro.dados.Pessoa;
import br.cadastro.dados.Produto;

import java.util.*;
import javax.swing.JOptionPane;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;






public class App {
    public static void main (String[] args) {
        String aux = "";
        int aux2 = 0;
        String nome = "";
        String cpf = "";
        Scanner ler = new Scanner (System.in);
        double preco = 0.0;


        while (true) {
            aux = JOptionPane.showInputDialog ("Menu:\n1 - Adicionar clientes\n|\n2 - Adicionar Produtos\n---------------------\n3 - Mostrar Clientes Cadastrados\n|\n4 - Mostrar" +
                    "Cadastro de Produtos\n--------------------\n5 - Realizar uma Venda");

            aux2 = parseInt (aux);
            switch (aux2) {
                case 1:
                    while (true) {
                        CadClientes.carregar();
                        nome = JOptionPane.showInputDialog ("Nome do cliente");
                        if (nome.equals ("/")) {
                            JOptionPane.showMessageDialog (null, "Reiniciando");
                            continue;
                        }
                        if (nome.equals (";")) {
                            break;
                        }
                        cpf = JOptionPane.showInputDialog ("CPF do cliente");
                        if (cpf.equals ("/")) {
                            JOptionPane.showMessageDialog (null, "Reiniciando");
                            continue;
                        }
                        if (cpf.equals (";")) {
                            break;
                        }
                        Cliente c = new Cliente (nome,cpf);
                        CadClientes.inserir (c);
                    }
                    break;
                case 3:
                    CadClientes.carregar ();
                    JOptionPane.showMessageDialog (null, CadClientes.cadastro ());
                    break;
                case 2:
                    while (true) {
                        CadProdutos.carregar();
                        nome = JOptionPane.showInputDialog ("Nome do produto");
                        if (nome.equals ("/")) {
                            JOptionPane.showMessageDialog (null, "Reiniciando");
                            continue;
                        }
                        if (nome.equals (";")) {
                            break;
                        }
                        aux = JOptionPane.showInputDialog ("Preço do produto");
                        preco = parseDouble (aux);
                        if (aux.equals ("/")) {
                            JOptionPane.showMessageDialog (null, "Reiniciando");
                            continue;
                        }
                        if (aux.equals (";")) {
                            break;
                        }
                        Produto p = new Produto (nome, preco);
                        CadProdutos.inserir (p);
                    }
                    break;
                case 4:
                    CadProdutos.carregar();
                    JOptionPane.showMessageDialog (null, CadProdutos.cadastro());
                    break;
                case 5:
                    CadClientes.carregar();
                    itemVenda i = null;
                    Venda v = null;
                    String s = JOptionPane.showInputDialog ("Nome do Cliente");
                    try {
                       Cliente c = CadClientes.getCliente(s);
                        v = new Venda(c);
                    }catch(IllegalArgumentException e){
                        JOptionPane.showMessageDialog(null,"Erro:"+e.getMessage()+" tente novamente");
                        break;
                    }
                    while(!aux.equals(".")) {
                        CadProdutos.carregar();
                        aux = JOptionPane.showInputDialog("Quantidade do Produto");
                        if(aux.equals(".")){
                            break;
                        }
                        aux2 = parseInt(aux);
                        aux = JOptionPane.showInputDialog("Nome do Produto");
                        if(aux.equals(".")){
                            break;
                        }
                        try {
                            Produto p = CadProdutos.get(aux);
                            i = new itemVenda(aux2, p);
                        } catch (IllegalArgumentException e) {
                            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage() + " tente novamente");
                            break;
                        }
                        v.inserir(i);
                    }
                    JOptionPane.showMessageDialog (null, v.toString()+"\n Valor: "+v.valorTotal());


            }
        }
    }
}