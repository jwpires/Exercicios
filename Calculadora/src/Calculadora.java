public class Calculadora {
    public static double soma(double n1, double n2){
        return (n1+n2);
    }

    public static double subtrai(double n1, double n2){
        return (n1-n2);
    }

    public static double multiplica(double n1, double n2){
        return (n1*n2);
    }

    public static double divide(double n1, double n2){
        return (n1/n2);
    }

    /*
    *  Scanner scanner = new Scanner(System.in);
        boolean continua = true;


            System.out.println("Informe a operação matemática: ");
            System.out.println("1:Soma ");
            System.out.println("2:Mult");
            System.out.println("3:Div");
            System.out.println("4:Sub");

            int operacao;
            operacao = scanner.nextInt();

            System.out.println("Informe 1 numero:");
            double n1 = scanner.nextDouble();

            System.out.println("Informe 2 numero:");
            double n2 = scanner.nextDouble();
            switch (operacao){
                case 1: System.out.println("Resultado: " + Calculadora.soma(n1, n2));
                    break;
                case 2: System.out.println("Resultado: " + Calculadora.multiplica(n1, n2));
                    break;
                case 3: System.out.println("Resultado: " + Calculadora.divide(n1, n2));
                    break;
                case 4: System.out.println("Resultado: " + Calculadora.subtrai(n1, n2));
                    break;
                default: System.out.println("Informação incorreta");
            }
    * */

}
