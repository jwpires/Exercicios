import java.util.Scanner;

public class Main {

    class Publica{
        public  static void main(String arg[]){
            Scanner scanner = new Scanner(System.in);
            /*● Após criar classe, criar uma classe Main realizando os seguintes passos:*/
            /* Criar um funcionário recebendo pelo terminal as informações de
            cada atributo*/
            Funcionario fun1;
            fun1.valorPorHora = 12.50;
            fun1.horasTrabalhadas = 180.5;
            fun1.nome = "Maria";
            fun1.sobrenome = "Silva";
            fun1.cidade = "São Paulo";
            fun1.estado = "São Paulo";

        /*Após criar o funcionário com as informações passadas, exibir um
            MENU com as opções:
            Incrementar quantidade de horas trabalhadas
        ■ Substituir o valor por hora do funcionário
        ■ Calcular o salário do funcionário no final do mês
        */
            System.out.println("Informe qual opção deseja realizar:");
            System.out.println("1 - Incrementar quantidade de horas trabalhadas");
            System.out.println("2 - Substituir o valor por hora do funcionário")
            System.out.println("3 - Calcular o salário do funcionário no final do mês");
            int opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Informe o valor a ser incrementado");
                    double valor = scanner.nextDouble();
                    fun1.incrementarHorasTrabalhadas();
                }
            }
        }
    }
}
