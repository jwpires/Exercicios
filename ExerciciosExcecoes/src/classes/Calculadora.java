package classes;

/*
1. Cria uma Classe Calculadora, que realiza as 4 operações aritméticas básicas a partir de dois valores
recebidos em console. Faça um controle de exceção caso o usuário tente fazer uma divisão por zero.

        Dicas:
        - Faça a divisão por 0 e veja qual a exceção que é lançada. Trate exclusivamente essa exceção.
        - Dê nomes significativos a cada objeto, variável e função que estiver criando : )
*/


public class Calculadora{

   public Calculadora(){
   }

        public double soma(double n1, double n2){
            return (n1+n2);
        }

        public double subtrai(double n1, double n2){
            return (n1-n2);
        }

        public double multiplica(double n1, double n2){
            return (n1*n2);
        }

        public double divide(int n1, int n2){
            double result = 0.0;
            try{
                result =  n1 / n2;
            }catch (ArithmeticException e){
                System.out.println("Não é possível dividir um número por 0, regra matemática.");
                result = 0;
            }finally {
                return result;
            }

        }

}
