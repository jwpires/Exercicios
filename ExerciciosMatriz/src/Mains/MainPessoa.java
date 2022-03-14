package Mains;

import classe.Pessoa;

import java.util.Scanner;

public class MainPessoa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cadastro: Pessoa");
        System.out.println("Insira o nome da pessoa");
        String nome = entrada.nextLine();
        System.out.println("Insira o endereço da pessoa");
        String endereco = entrada.nextLine();
        System.out.println("Insira o telefone da pessoa");
        String telefone = entrada.nextLine();

        Pessoa pessoa = new Pessoa(nome, endereco, telefone);

        System.out.println(pessoa.toString());



    }
}
