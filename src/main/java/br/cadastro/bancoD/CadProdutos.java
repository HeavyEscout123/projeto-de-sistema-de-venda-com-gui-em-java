package br.cadastro.bancoD;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import br.cadastro.dados.Cliente;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import br.cadastro.dados.Produto;

import java.util.ArrayList;
public class CadProdutos {
        private static ArrayList<Produto> a = new ArrayList<>();
        private static final String ARQUIVO = "produtos.json";



    public static String get(int codigo){
        for (Produto b : a) {
            if (codigo == b.getCodigo()) {
                return b.getNome();
            }
        }
        return "br.cadastro.dados.Cliente não encontrado";
    }


    public static void inserir(Produto b){
        a.add(b);
        salvar();
    }

    public static String cadastro(){
        StringBuilder x = new StringBuilder();
        for (Produto b : a) {
            x.append(b.toString());
            x.append("\n");
        }
        return x.toString();

    }

    public static void carregar() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(ARQUIVO)) {
            a = gson.fromJson(reader, new TypeToken<ArrayList<Produto>>(){}.getType());
        } catch (IOException e) {
            System.err.println("Erro ao carregar os dados: " + e.getMessage());
        }
    }


    private static void salvar() {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(ARQUIVO)) {
            gson.toJson(a, writer);  //
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }
}

