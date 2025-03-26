package br.cadastro.bancoD;

import br.cadastro.dados.Cliente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CadClientes {
    private static ArrayList<Cliente> b = new ArrayList<>();
    private static final String ARQUIVO = "clientes.json";

    public static void inserir(Cliente a){
        b.add(a);
        salvar();
    }

    public static String getNome(int codigo){
        for (Cliente b : b) {
            if (codigo == b.getCodigo()) {
                return b.getNome();
            }
        }
        return "br.cadastro.dados.Cliente não encontrado";
    }

    public static String cadastro() {
        StringBuilder x = new StringBuilder();
        for (Cliente b : b) {
            x.append(b.toString());
            x.append("\n");
        }
        return x.toString();
    }

    private static void salvar() {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter(ARQUIVO)) {
            gson.toJson(b, writer);  // Converte a lista de clientes para JSON e escreve no arquivo
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    public static void carregar() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(ARQUIVO)) {
            // Carrega os dados do arquivo JSON para a lista de clientes
            b = gson.fromJson(reader, new TypeToken<ArrayList<Cliente>>(){}.getType());
        } catch (IOException e) {
            System.err.println("Erro ao carregar os dados: " + e.getMessage());
        }
    }
}
