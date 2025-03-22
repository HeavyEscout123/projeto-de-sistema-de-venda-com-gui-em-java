public class Produto {
    private final int codigo;
    private String nome;
    private double preco;

public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;

}

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }


    public String toString() {
        return "Preco: "+preco+" Nome: "+nome+" Codigo: "+codigo;
    }
}
