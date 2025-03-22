
import java.util.*;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;

public class App {
    public static void main(String[] args) {
        String aux = "";
        int aux2 = 0;
        String nome = "";
        String cpf = "";
        Scanner ler = new Scanner(System.in);

        while (true) {
            aux = JOptionPane.showInputDialog("Menu:\n1 - Adicionar clientes\n2 - Mostrar Clientes Cadastrados\n3 - Adicionar Produtos");
            aux2 = parseInt(aux);
            switch (aux2) {
                case 1:
                    while (true) {
                        nome = JOptionPane.showInputDialog("Nome do cliente");
                        if (nome.equals("/")) {
                            JOptionPane.showMessageDialog(null, "Reiniciando");
                            continue;
                        }
                        if (nome.equals(";")) {
                            break;
                        }
                        cpf = JOptionPane.showInputDialog("CPF do cliente");
                        if (cpf.equals("/")) {
                            JOptionPane.showMessageDialog(null, "Reiniciando");
                            continue;
                        }
                        if (cpf.equals(";")) {
                            break;
                        }
                        Pessoa p = new Pessoa(nome, cpf);
                        Cliente c = new Cliente(p);
                        CadClientes.inserir(c);
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, CadClientes.cadastro());
                    break;
                case 3:
                    // Adicionar implementação para adicionar produtos
                    break;
            }
        }
    }
}


