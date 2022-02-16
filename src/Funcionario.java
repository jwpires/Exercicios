/*Exercício 01
        Nesta atividade vocês deverão criar uma classe Funcionário com os seguintes
        atributos:
        ● Nome
        ● Sobrenome
        ● Cidade
        ● Estado
        ● Horas Trabalhadas
        ● Valor Por Hora
       */
public class Funcionario {

    String nome, sobrenome, cidade ,estado;
    double horasTrabalhadas = 0;
    double valorPorHora =  0;


    //Este funcionário deverá ter os seguintes métodos:

    // Exibir na tela o nome e sobrenome
    void exibirNomeCompleto(String nome, String sobrenome, double horasTrabalhadas, double valorPorHora){
        System.out.println("Nome completo: "+this.nome+" "+this.sobrenome+".");
    }

    // Adicionar um construtor default e um construtor com os valores para inicializar o objeto
    //construtor com os valores
    Funcionario( String nome, String sobrenome){

    }
    //construtor default
    Funcionario(){

    }

    //Incrementar quantidade de horas no valor atual de horas trabalhadas
    void incrementarHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas+= horasTrabalhadas;
        System.out.println("Valor incrementado: "+this.horasTrabalhadas);
    }

    /*Receber novo valor por hora trabalhada por parâmetro e alterar o valor por
    hora do funcionário e logo em seguida exibir o novo valor na tela*/
    void alterarValorPorHora(double novoValorPorHora){
        this.valorPorHora = novoValorPorHora;
        System.out.println("Valor por hora trabalhado foi alterado para: "+this.valorPorHora);
    }


    /*Método para calcular o salário que o funcionário receberá no final do mês,
    e em seguida imprimir o valor.*/
    void salario(){
        System.out.println("Salario a ser recebido: "+(this.valorPorHora*this.horasTrabalhadas));
    }

}
