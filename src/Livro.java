/*Nesta atividade vocês deverão criar uma classe Livro com os seguintes atributos:
        ● Título
        ● Nome do Leitor
        ● Quantidade de páginas total
        ● Quantidade de páginas lidas
        Este livro deverá ter os seguintes métodos:
        ● Criar um método para verificar o progresso do livro, ele deverá calcular a
        porcentagem de leitura do livro até o momento e retornar a mensagem: “Você
        já leu X% do livro”.
        ● Após criar a classe Livro, vocês devem criar uma classe Main com os
        seguintes passos:
        ○ Receber informações pela entrada do teclado dos atributos da classe
        ○ Logo em seguida chamar o método para verificar o progresso da
        leitura do livro
*/

public class Livro {

    String titulo,nomeDoLeitor;
    int qtdPaginasTotal = 0, qtdPaginasLidas = 0;

    Livro(int qtdPaginasTotal,int  qtdPaginasLidas){
        this.qtdPaginasLidas = qtdPaginasLidas;
        this.qtdPaginasTotal = qtdPaginasTotal;
    }

    Livro(){

    }

    /*Criar um método para verificar o progresso do livro, ele deverá calcular a
        porcentagem de leitura do livro até o momento e retornar a mensagem: “Você
        já leu X% do livro”. */
    void progressoLeitura(){
        System.out.println(" Você já leu "+(((double) this.qtdPaginasLidas/(double)this.qtdPaginasTotal)*100)+"% do livro.");
    }

}
