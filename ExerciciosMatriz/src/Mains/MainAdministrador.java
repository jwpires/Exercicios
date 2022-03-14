package Mains;


import classe.Administrador;

import java.util.Scanner;

public class MainAdministrador {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String funcao = "Administrador";

        System.out.println("Cadastro:  "+funcao);

        System.out.println("Insira o nome do "+funcao);
        String nome = entrada.nextLine();

        System.out.println("Insira o endereço do "+funcao);
        String endereco = entrada.nextLine();

        System.out.println("Insira o telefone do "+funcao);
        String telefone = entrada.nextLine();

        entrada.nextLine();


        System.out.println("Insira o código do "+funcao);
        int codigoSetor = entrada.nextInt();

        System.out.println("Insira o salário base do "+funcao);
        double salarioBase = entrada.nextDouble();

        System.out.println("Insira o percentual de imposto do "+funcao);
        double imposto = entrada.nextDouble();

        System.out.println("Insira o a ajuda de custo do "+funcao);
        double ajudaDeCusto= entrada.nextDouble();

        Administrador administrador = new Administrador( nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);

        System.out.println(administrador.toString());

        System.out.printf("O Salário do colaborador é: R$%.2f",administrador.calcularSalario(administrador));


    }
}
