package Mains;

import java.util.Scanner;

import classe.Funcionario;

public class Main {

        public static void main(String arg[]){
            Scanner scanner = new Scanner(System.in);
            /*● Após criar classe, criar uma classe Main realizando os seguintes passos:*/
            /* Criar um funcionário recebendo pelo terminal as informações de
            cada atributo*/
            Funcionario fun1 = new Funcionario( "Maria", "Regina");
            fun1.setValorPorHora(12.50);
            fun1.setHorasTrabalhadas(180.5);
            fun1.setCidade("São Paulo");
            fun1.setEstado("São Paulo");

        /*Após criar o funcionário com as informações passadas, exibir um
            MENU com as opções:
            Incrementar quantidade de horas trabalhadas
        ■ Substituir o valor por hora do funcionário
        ■ Calcular o salário do funcionário no final do mês
        */
            System.out.println("Informe qual opção deseja realizar:");
            System.out.println("1 - Incrementar quantidade de horas trabalhadas");
            System.out.println("2 - Substituir o valor por hora do funcionário");
            System.out.println("3 - Calcular o salário do funcionário no final do mês");
            int opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Informe o valor a ser incrementado");
                    double valor = scanner.nextDouble();
                    fun1.incrementarHorasTrabalhadas(valor);
                    break;

                case 2:
                    System.out.println("Informe o novo valor por hora do funcionário");
                    double valor1 = scanner.nextDouble();
                    fun1.alterarValorPorHora(valor1);
                    break;

                case 3:
                    fun1.salario();
                    break;
            }

        }
}



