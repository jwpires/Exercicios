package classes;

public class Bebida extends Produto {
    private int quantidade = 0;

    public Bebida(String tipo, String nomeProduto, double preco, int quantidade){
        super(tipo,nomeProduto,preco);
        this.quantidade = quantidade;
    }

    public void setQuantidade (int quantidade){
        this.quantidade+= quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
}
