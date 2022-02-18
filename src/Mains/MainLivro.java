package Mains;/*
        ● Após criar a classe classe.Livro, vocês devem criar uma classe Main com os
        seguintes passos:
*/


import classe.Livro;

import java.util.Scanner;

public class MainLivro {

    public static void main(String [] args){
        //Receber informações pela entrada do teclado dos atributos da classe
        Scanner scanner = new Scanner(System.in);
        int totalPaginas = 0, totalPaginasLidas = 0;
        System.out.println("Informe o total de páginas do livro que está lendo:");
        totalPaginas = scanner.nextInt();
        System.out.println("Informe a quantidade de páginas que já leu: ");
        totalPaginasLidas = scanner.nextInt();

        //Logo em seguida chamar o método para verificar o progresso da leitura do livro
        Livro livro1 = new Livro(totalPaginas, totalPaginasLidas);
        livro1.setTitulo("História dos Hebreus");
        livro1.setNomeDoLeitor("José Pires");

        //○ Logo em seguida chamar o método para verificar o progresso da leitura do livro
        livro1.progressoLeitura();


    }
}
