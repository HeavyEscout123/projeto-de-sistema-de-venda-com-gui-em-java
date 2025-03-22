
import java.util.Random;


public class Cliente{
private String nome;
private  int codigo;
private static Random r = new Random ();

    public Cliente(Pessoa a){
    this.nome = a.getNome();
    this.codigo = r.nextInt (101);

    }
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }


    public String toString() {
        return "Nome: " +nome+ " codigo: "+codigo;
    }
}

