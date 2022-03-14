package Mains;

import classe.Operario;

import java.util.Scanner;

public class MainOperario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String funcao = "Operário";

        System.out.println("Cadastro:  "+funcao);

        System.out.println("Insira o nome do "+funcao);
        String nome = entrada.nextLine();

        System.out.println("Insira o endereço do "+funcao);
        String endereco = entrada.nextLine();

        System.out.println("Insira o telefone do "+funcao);
        String telefone = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Insira o código do setor do "+funcao);
        int codigoSetor = entrada.nextInt();

        System.out.println("Insira o salário base do "+funcao);
        double salarioBase = entrada.nextDouble();

        System.out.println("Insira o percentual de imposto do "+funcao);
        double imposto = entrada.nextDouble();

        System.out.println("Insira o valor de produção mensal do "+funcao);
        double valorProducao = entrada.nextDouble();

        System.out.println("Insira o percentual de Comissão do "+funcao);
        double comissao = entrada.nextDouble();

        Operario operario = new Operario( nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorProducao, comissao);

        System.out.println(operario.toString());

        System.out.printf("O Salário do %s é: R$%.2f",funcao,operario.calcularSalario(operario));
    }
}