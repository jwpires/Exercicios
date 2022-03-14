package classes;

public abstract class Produto {
    private String  tipo;
    private String  nomeProduto;
    private double  preco;

    public Produto(String tipo, String nomeProduto, double preco){
        this.tipo = tipo;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public void setTipo( String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }

}
