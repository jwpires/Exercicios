/*
* Nesta atividade vocês deverão criar uma classe Veículo com os seguintes atributos:
● Modelo
● Marca
● Ano
● Velocidade Máxima
● Cor
● Valor FIPE
* */

public class Veiculo {

    String modelo, marca, cor;
    int ano;
    double velocidadeMaxima =0, velocidade = 0, valorFIPE = 0;

    Veiculo (String modelo, String marca, String cor, int ano, double velocidadeMaxima, double velocidade, double valorFIPE){
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        this.valorFIPE = valorFIPE;
        this.velocidade = velocidade;
    }

    Veiculo(){

    }

    /** Este Veículo deverá ter os seguintes métodos: **/

    //● Imprimir “Marca, Modelo, Ano”
    void exibeInformacoes(){
        System.out.println( "Marca: "+this.marca+" Modelo: "+this.modelo+" Ano: "+this.ano+".");
    }

    /*
    ● Método para adicionar velocidade recebendo o valor por parâmetro
        ○ Caso o valor da velocidade seja maior do que o máximo permitido,
        deverá imprimir a seguinte mensagem: “Velocidade acima do valor
        permitido para o veículo”. Caso o valor seja aceito, deverá exibir a
        mensagem: “Estou acelerando {quantidade} km/h”
    * */
    void acelerar(int adicinaVelocidade){
        if ((this.velocidade + adicinaVelocidade) > this.velocidadeMaxima){
            System.out.println("Velocidade acima do valor permitido para o veículo");
        }else {
            this.velocidade+= adicinaVelocidade;
            System.out.println("Estou acelerando "+adicinaVelocidade+" km/h");
        }
    }

    //● Método para frear o veículo e exibir a mensagem: “Estou freando o veículo {modelo do veículo}"
    void frear(){
        if (this.velocidade == 0){
            System.out.println("Veículo já está parado.");
        }else {
            System.out.println("Estou freando o veículo "+this.modelo+".");
        }

    }

}
