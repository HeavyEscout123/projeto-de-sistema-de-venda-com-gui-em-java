public class itemVenda {
    private int quantidade;
    private Produto prod;

    public itemVenda(int quant,Produto prod){
        this.quantidade = quant;
        this.prod = prod;
    }

    public double getValor(){
        return prod.getPreco()* quantidade;
    }

    public String toString(){
        return prod.getNome()+" "+quantidade+" ";
    }

}
