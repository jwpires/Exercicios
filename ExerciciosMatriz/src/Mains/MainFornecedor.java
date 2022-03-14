package Mains;

import classe.Fornecedor;

import java.util.Scanner;

public class MainFornecedor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String funcao = "Fornecedor";

        System.out.println("Cadastro: "+funcao);
        System.out.println("Insira o nome do "+funcao);
        String nome = entrada.nextLine();
        System.out.println("Insira o endereço do "+funcao);
        String endereco = entrada.nextLine();
        System.out.println("Insira o telefone do "+funcao);
        String telefone = entrada.nextLine();
        System.out.println("Insira o valor do crédito do "+funcao);
        double valorCredito = entrada.nextDouble();
        System.out.println("Insira o valor da dívida do "+funcao);
        double valorDivida = entrada.nextDouble();

        Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);

        System.out.println(fornecedor.toString());

        System.out.printf("O saldo do %s é %.2f ",funcao,fornecedor.obterSaldo(fornecedor));

    }
}
