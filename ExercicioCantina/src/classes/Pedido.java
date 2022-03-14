package classes;


public class Pedido implements ICalculoTaxaDeEntrega {
    private double valorAPagar = 0.0d;
    private double totalTaxaEntrega = 0.0d;

    private Lanche lanche01 = new Lanche ("Lanche","Burger",30.00,0);
    private Lanche lanche02 = new Lanche ("Lanche","Pizza",45.00,0);
    private Lanche lanche03 = new Lanche ("Lanche","Fogazza",20.00,0);

    private Comida comida01 = new Comida("Prato","Pasta",30.00, 0);
    private Comida comida02 = new Comida("Prato","Lasanha",70.00, 0);
    private Comida comida03 = new Comida("Prato","Polpetone",50.00, 0);

    private Bebida bebida01 = new Bebida("Bebida","Refrigerante",5.00,0);
    private Bebida bebida02 = new Bebida("Bebida","Suco",7.00,0);
    private Bebida bebida03 = new Bebida("Bebida","Vinho",50.00,0);

    private Lanche[] lanches = new Lanche[]{lanche01, lanche02, lanche03};
    private Bebida[] bebidas = new Bebida[]{bebida01, bebida02, bebida03};
    private Comida[] comidas = new Comida[]{comida01, comida02, comida03};

    public void setValorAPagar(double valorAPagar){
        this.valorAPagar += valorAPagar;
    }
    public double getValorAPagar(){
        return this.valorAPagar;
    }

    public double totalPedido(){
        return (this.valorAPagar+this.totalTaxaEntrega);
    }

    public double totalAPagar(){
        return (this.valorAPagar+this.totalTaxaEntrega);
    }

    @Override
    public void addtaxaDeEntrega(String tipo, int qtd) {
        if(tipo == "Prato"){
            this.totalTaxaEntrega+= 2.00 * qtd;
        }else this.totalTaxaEntrega+= 1.00 * qtd;
    }

    public double getTotalTaxaEntrega(){
        return this.totalTaxaEntrega;
    }

    public Lanche getLanche01(){  return lanche01; }
    public Lanche getLanche02(){
        return lanche02;
    }
    public Lanche getLanche03(){
        return lanche03;
    }

    public Comida getComida01(){
        return this.comida01;
    }
    public Comida getComida02(){
        return this.comida02;
    }
    public Comida getComida03(){
        return this.comida03;
    }

    public Bebida getBebida01(){
        return bebida01;
    }
    public Bebida getBebida02(){
        return bebida02;
    }
    public Bebida getBebida03(){
        return bebida03;
    }

    public String toString(){
        return "Lanches:"+
                "\n'"+lanche01.getNomeProduto()+" - "+lanche01.getPreco()+
                "'\n'"+lanche02.getNomeProduto()+" - "+lanche02.getPreco()+
                "'\n'"+lanche03.getNomeProduto()+" - "+lanche03.getPreco()+"'\n\n"+
                "Comida:"+
                "\n'"+comida01.getNomeProduto()+" - "+comida01.getPreco()+
                "'\n'"+comida02.getNomeProduto()+" - "+comida02.getPreco()+
                "'\n'"+comida03.getNomeProduto()+" - "+comida03.getPreco()+"'\n\n"+
                "Bebidas:"+
                "\n'"+bebida01.getNomeProduto()+" - "+bebida01.getPreco()+
                "'\n'"+bebida02.getNomeProduto()+" - "+bebida02.getPreco()+
                "'\n'"+bebida03.getNomeProduto()+" - "+bebida03.getPreco()+"'\n\n'";
    }



};

