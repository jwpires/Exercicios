package Mains;


import classe.Veiculo;

public class MainVeiculo {

    public static void main(String [] args){
        Veiculo carro1 = new Veiculo("Sedã", "Toyota", "Prata", 2022, 180.00, 120.00, 180690.00);

        carro1.exibeInformacoes();
        carro1.setAcelerar(70);
        carro1.setAcelerar(30);
        carro1.frear();
        carro1.setVelocidade(110);
        carro1.frear();


    }
}
