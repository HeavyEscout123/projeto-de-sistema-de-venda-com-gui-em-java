package br.cadastro;


import br.cadastro.bancoD.CadClientes;
import br.cadastro.bancoD.CadProdutos;
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
            aux = JOptionPane.showInputDialog ("Menu:\n1 - Adicionar clientes\n2 - Mostrar Clientes Cadastrados\n3 - Adicionar Produtos\n4 - Mostrar" +
                    "Cadastro de Produtos");

            aux2 = parseInt (aux);
            switch (aux2) {
                case 1:
                    while (true) {
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
                case 2:
                    CadClientes.carregar ();
                    JOptionPane.showMessageDialog (null, CadClientes.cadastro ());
                    break;
                case 3:
                    while (true) {
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
                    JOptionPane.showMessageDialog (null, CadProdutos.cadastro ());
                case 5:
                    aux = JOptionPane.showInputDialog ("Quantidade do Produto");
                    aux2 = parseInt(aux);
                    aux = JOptionPane.showInputDialog ("Nome do Produto");



            }
        }
    }
}