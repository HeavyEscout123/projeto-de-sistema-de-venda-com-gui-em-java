import java.util.ArrayList;
import java.io.*;

public class CadClientes {
private static ArrayList<Cliente> b = new ArrayList<>();




public static void inserir(Cliente a){
    b.add(a);

}

public static String getNome(int codigo){
    for (Cliente b : b) {



        if (codigo == b.getCodigo()) {
            return b.getNome();
        }

    }
    return "Cliente não encontrado";
}


public static String cadastro (){
    StringBuilder x = new StringBuilder();
    for(Cliente b : b){;


         x.append(b.toString());
         x.append("\n");
    }
    return x.toString();
}




    }







