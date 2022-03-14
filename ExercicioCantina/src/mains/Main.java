package mains;
import java.util.Scanner;
import classes.Pedido;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Pedido pedidos = new Pedido();

        System.out.println("Seja bem Vindo à Cantina Codifichiamo");
        System.out.println("Conheça nosso cardápio:");

        String nome;
        int opc;

        int continuarComprando; // 1 - Não; 0 - Sim
        do {
            do {
                System.out.println(pedidos.toString());
                opc = 0;
                System.out.println("Digite o nome da opção que deseja:");
                nome = scan.nextLine();

                opc = validaNome(nome);
                if (opc < 1 || opc > 3){
                    System.out.println("Opção não é válida, por favor, informe novamente.");
                }
            }while (opc < 1 || opc > 3);
            continuarComprando = 1; // 1 - Não; 0 - Sim
            switch (opc) {
                case 1: {
                    int qtd = 0, opcCase1 = 0;
                    do {
                        System.out.println("informe o Lanche que deseja, sendo:");
                        System.out.println("Burguer - $30");
                        System.out.println("Pizza - $45");
                        System.out.println("Fogazza  -$20");
                        nome = scan.nextLine();
                        opcCase1 = validaNomeProduto(nome);
                        if (opcCase1 < 1 || opcCase1 > 3) {
                            System.out.println("Opção não é válida, por favor, informe novamente.");
                        }
                    } while (opcCase1 < 1 || opcCase1 > 3);

                    do {
                        System.out.println("Informe a quantidade:");
                        qtd = scan.nextInt();
                        if (qtd < 1) {
                            System.out.println("Valor inválido, informe pelo menos 1 unidade.");
                        }
                    } while (qtd < 1);

                    // colcoar função de taxa
                    if (opcCase1 == 1) {
                        pedidos.setValorAPagar(pedidos.getLanche01().getPreco() * qtd);
                        pedidos.addtaxaDeEntrega(pedidos.getLanche01().getTipo(), qtd);
                        pedidos.getLanche01().setQuantidade(qtd);
                        /*System.out.println("Saldo a pagar: "+pedidos.getValorAPagar());
                        System.out.println("Saldo taxa entrega: "+pedidos.getTotalTaxaEntrega());
                        System.out.println("Saldo valor total: "+pedidos.totalAPagar());*/
                    } else if (opcCase1 == 2) {
                        pedidos.setValorAPagar(pedidos.getLanche02().getPreco() * qtd);
                        pedidos.addtaxaDeEntrega(pedidos.getLanche02().getTipo(), qtd);
                        pedidos.getLanche02().setQuantidade(qtd);
                        /*System.out.println("Saldo a pagar: "+pedidos.getValorAPagar());
                        System.out.println("Saldo taxa entrega: "+pedidos.getTotalTaxaEntrega());
                        System.out.println("Saldo valor total: "+pedidos.totalAPagar());*/
                    } else {
                        pedidos.setValorAPagar(pedidos.getLanche03().getPreco() * qtd);
                        pedidos.addtaxaDeEntrega(pedidos.getLanche03().getTipo(), qtd);
                        pedidos.getLanche03().setQuantidade(qtd);
                        /*System.out.println("Saldo a pagar: "+pedidos.getValorAPagar());
                        System.out.println("Saldo taxa entrega: "+pedidos.getTotalTaxaEntrega());
                        System.out.println("Saldo valor total: "+pedidos.totalAPagar());*/
                    }

                }
                break;

                case 2: {
                    int qtd = 0, opcCase2 = 0;
                    do {
                        System.out.println("informe a comida que deseja, sendo:");
                        System.out.println("Pasta - $30");
                        System.out.println("Lasanha - $70");
                        System.out.println("Polpetone -  $50");
                        nome = scan.nextLine();
                        opcCase2 = validaNomeProduto(nome);

                        if (opcCase2 < 1 || opcCase2 > 3) {
                            System.out.println("Opção não é válida, por favor, informe novamente.");
                        }
                    } while (opcCase2 < 1 || opcCase2 > 3);

                    do {
                        System.out.println("Informe a quantidade:");
                        qtd = scan.nextInt();
                        if (qtd < 1) {
                            System.out.println("Valor inválido, informe pelo menos 1 unidade.");
                        }
                    } while (qtd < 1);

                    // colcoar função de taxa
                    if (opcCase2 == 1) {
                        pedidos.setValorAPagar(pedidos.getComida01().getPreco() * qtd);
                        pedidos.addtaxaDeEntrega(pedidos.getComida01().getTipo(), qtd);
                        pedidos.getComida01().setQuantidade(qtd);
                        /*System.out.println("Saldo a pagar: "+pedidos.getValorAPagar());
                        System.out.println("Saldo taxa entrega: "+pedidos.getTotalTaxaEntrega());
                        System.out.println("Saldo valor total: "+pedidos.totalAPagar());*/
                    } else if (opcCase2 == 2) {
                        pedidos.setValorAPagar(pedidos.getComida02().getPreco() * qtd);
                        pedidos.addtaxaDeEntrega(pedidos.getComida02().getTipo(), qtd);
                        pedidos.getComida02().setQuantidade(qtd);
                        /*System.out.println("Saldo a pagar: "+pedidos.getValorAPagar());
                        System.out.println("Saldo taxa entrega: "+pedidos.getTotalTaxaEntrega());
                        System.out.println("Saldo valor total: "+pedidos.totalAPagar());*/
                    } else {
                        pedidos.setValorAPagar(pedidos.getComida03().getPreco() * qtd);
                        pedidos.addtaxaDeEntrega(pedidos.getComida03().getTipo(), qtd);
                        pedidos.getComida03().setQuantidade(qtd);
                        /*System.out.println("Saldo a pagar: "+pedidos.getValorAPagar());
                        System.out.println("Saldo taxa entrega: "+pedidos.getTotalTaxaEntrega());
                        System.out.println("Saldo valor total: "+pedidos.totalAPagar());*/
                    }

                }
                break;

                case 3: {
                    int qtd = 0, opcCase3 = 0;
                    do {
                        System.out.println("informe a bebida que deseja, sendo:");
                        System.out.println("Refrigerante- $5");
                        System.out.println("Suco - $7");
                        System.out.println("Vinho -  $50");
                        nome = scan.nextLine();
                        opcCase3 = validaNomeProduto(nome);
                        if (opcCase3 < 1 || opcCase3 > 3) {
                            System.out.println("Opção não é válida, por favor, informe novamente.");
                        }
                    } while (opcCase3 < 1 || opcCase3 > 3);

                    do {
                        System.out.println("Informe a quantidade:");
                        qtd = scan.nextInt();
                        if (qtd < 1) {
                            System.out.println("Valor inválido, informe pelo menos 1 unidade.");
                        }
                    } while (qtd < 1);

                    // colcoar função de taxa
                    if (opcCase3 == 1) {
                        pedidos.setValorAPagar(pedidos.getBebida01().getPreco() * qtd);
                        pedidos.addtaxaDeEntrega(pedidos.getBebida01().getTipo(), qtd);
                        pedidos.getBebida01().setQuantidade(qtd);
                       /* System.out.println("Saldo a pagar: "+pedidos.getValorAPagar());
                        System.out.println("Saldo taxa entrega: "+pedidos.getTotalTaxaEntrega());
                        System.out.println("Saldo valor total: "+pedidos.totalAPagar());*/
                    } else if (opcCase3 == 2) {
                        pedidos.setValorAPagar(pedidos.getBebida02().getPreco() * qtd);
                        pedidos.addtaxaDeEntrega(pedidos.getBebida02().getTipo(), qtd);
                        pedidos.getBebida02().setQuantidade(qtd);
                        /*System.out.println("Saldo a pagar: "+pedidos.getValorAPagar());
                        System.out.println("Saldo taxa entrega: "+pedidos.getTotalTaxaEntrega());
                        System.out.println("Saldo valor total: "+pedidos.totalAPagar());*/
                    } else {
                        pedidos.setValorAPagar(pedidos.getBebida03().getPreco() * qtd);
                        pedidos.addtaxaDeEntrega(pedidos.getBebida03().getTipo(), qtd);
                        pedidos.getBebida03().setQuantidade(qtd);
                        /*System.out.println("Saldo a pagar: "+pedidos.getValorAPagar());
                        System.out.println("Saldo taxa entrega: "+pedidos.getTotalTaxaEntrega());
                        System.out.println("Saldo valor total: "+pedidos.totalAPagar());*/
                    }

                }
                break;

            }
            System.out.println("Deseja adionar mais algum item?");
            System.out.println("Digite:");
            System.out.println("0 : Para selecionar outro item");
            System.out.println("1 : Para fechar o Pedido.");
            continuarComprando = scan.nextInt();
            while (continuarComprando < 0 || continuarComprando > 1){
                System.out.println("Valor não é válido, por favor, informe uma das opções:");
                System.out.println("0 : Para selecionar outro item");
                System.out.println("1 : Para fechar o Pedido.");
                continuarComprando = scan.nextInt();
            }
            //opc = 0; // reset da opção do cardápio.
        }while (continuarComprando == 0);

        System.out.print("Seu Pedido está sendo montado.");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(1000);

        System.out.println("");

        System.out.println("**CONFERÊNCIA DELIVERY**");
        System.out.println("");
        if (pedidos.getLanche01().getQuantidade() > 0){
            System.out.println("Qtd:    "+pedidos.getLanche01().getQuantidade()+"   "
                    +"Prod.:    "+pedidos.getLanche01().getNomeProduto()+
                    "   Subtotal:   "+(pedidos.getLanche01().getPreco()*pedidos.getLanche01().getQuantidade()));

        }
        if (pedidos.getLanche02().getQuantidade() > 0){
            System.out.println("Qtd:    "+pedidos.getLanche02().getQuantidade()+"   " +
                    "Prod.: "+ pedidos.getLanche02().getNomeProduto()+
                    "   Subtotal:   "+(pedidos.getLanche02().getPreco()*pedidos.getLanche02().getQuantidade()));

        }
        if (pedidos.getLanche03().getQuantidade() > 0){
            System.out.println("Qtd:    "+pedidos.getLanche03().getQuantidade()+"   " +
                    "Prod.: "+pedidos.getLanche03().getNomeProduto()+
                    "   Subtotal:   "+(pedidos.getLanche03().getPreco()*pedidos.getLanche03().getQuantidade()));

        }
        if (pedidos.getComida01().getQuantidade() > 0){
            System.out.println("Qtd:    "+pedidos.getComida01().getQuantidade()+"   " +
                    "Prod.: "+ pedidos.getComida01().getNomeProduto()+
                    "   Subtotal:   "+(pedidos.getComida01().getPreco() * pedidos.getComida01().getQuantidade()));
        }
        if (pedidos.getComida02().getQuantidade() > 0){
            System.out.println("Qtd:    "+pedidos.getComida02().getQuantidade()+"   " +
                    "   Prod.:  "+ pedidos.getComida02().getNomeProduto()+
                    "   Subtotal:   "+(pedidos.getComida02().getPreco() * pedidos.getComida02().getQuantidade()));

        }
        if (pedidos.getComida03().getQuantidade() > 0){
            System.out.println("Qtd:    "+pedidos.getComida03().getQuantidade()+"   " +
                    "Prod.: "+ pedidos.getComida03().getNomeProduto()+
                    "   Subtotal:   "+(pedidos.getComida03().getPreco() * pedidos.getComida03().getQuantidade()));

        }
        if (pedidos.getBebida01().getQuantidade() > 0){
            System.out.println("Qtd:    "+pedidos.getBebida01().getQuantidade()+"   " +
                    "Prod.: "+ pedidos.getBebida01().getNomeProduto()+
                    "   Subtotal:   "+(pedidos.getBebida01().getPreco() * pedidos.getBebida01().getQuantidade()));

        }
        if (pedidos.getBebida02().getQuantidade() > 0){
            System.out.println("Qtd:    "+pedidos.getBebida02().getQuantidade()+"   " +
                    "   Prod.:  "+ pedidos.getBebida02().getNomeProduto()+
                    "   Subtotal:   "+(pedidos.getBebida02().getPreco() * pedidos.getBebida02().getQuantidade()));

        }
        if (pedidos.getBebida03().getQuantidade() > 0) {
            System.out.println("Qtd:    " + pedidos.getBebida03().getQuantidade() + "   " +
                    "   Prod.: " + pedidos.getBebida03().getNomeProduto() +
                    "   Subtotal:   " + (pedidos.getBebida03().getPreco() * pedidos.getBebida03().getQuantidade()));

        }

        System.out.println("----------------------------------Total Produtos: "+
                pedidos.getValorAPagar());
        System.out.println("----------------------------------Taxa Entrega(+): "+
                pedidos.getTotalTaxaEntrega());
        System.out.println("----------------- [̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅] Total a Pagar:   "+
                pedidos.totalPedido());

        System.out.println("Seu pedido está indo até você! (▀̿̿Ĺ̯̿▀̿ ̿)");
    }













    static int validaNome(String nome) {
        if(nome.toUpperCase().equals("LANCHES") == true){
            return 1;
        }else if(nome.toUpperCase().equals("COMIDA") == true){
            return 2;
        } else if(nome.toUpperCase().equals("BEBIDAS") == true){
            return 3;
        }else  return 0;
    }













    static int validaNomeProduto(String nome) {
        //if(opc == 1){
            if(nome.toUpperCase().equals("BURGUER")){
                return 1;
            }else if(nome.toUpperCase().equals("PIZZA")){
                return 2;
            } else if(nome.toUpperCase().equals("FOGAZZA")){
                return 3;
            //}else return 0;

        }else //if(opc == 2){
            if(nome.toUpperCase().equals("PASTA")){
                return 1;
            }else if(nome.toUpperCase().equals("LASANHA")){
                return 2;
            } else if(nome.toUpperCase().equals("POLPETONE")){
                return 3;
            //}else return 0;

        }else //if(opc == 1) {
            if (nome.toUpperCase().equals("REFRIGERANTE")) {
                return 1;
            } else if (nome.toUpperCase().equals("SUCO")) {
                return 2;
            } else if (nome.toUpperCase().equals("VINHO")) {
                return 3;
            } else return 0;
        }
        //return 0;

}


