import java.util.Scanner;

public class Exercicios {


        public static int somaIdade(int[] idade){
            int tamanho = idade.length;
            int result = 0;

            for(int i=0; i < tamanho; i++){
                result+= idade[i];
            }
            return result;
        }

        public static void exibe01(){
            int i=0;
            while(i < 20){
                i++;
                System.out.println(i+". Eu gosto de de algoritmo");
            }
        }

        public static void exibe02(){
            int result=0;
            for(int i=1; i <= 15; i++) {
                result += i;
            }
            System.out.println("Soma de 1 a 15: "+result);
        }

        public static void exibe03(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("informe um nome:");
            String nome = scanner.nextLine();
            int i = 0;
            while (i<10){
                i++;
                System.out.println(i+".Nome: "+nome);
            }scanner.close();

        }

        public static void exibe04(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("informe um nome:");
            String nome = scanner.nextLine();
            System.out.println("informe um numero:");
            int numero = scanner.nextInt();
            int i = 0;
            while (i<numero){
                i++;
                System.out.println(i+".Nome: "+nome);
        } scanner.close();

    }

    public static void exibe05(){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[9];

        int cont = 0;
        for(int i=0; i<10; i++){
            System.out.println("informe o "+(i+1)+" numero:");
            cont += scanner.nextInt();
        }
        System.out.println("Resultado:"+ cont);
        scanner.close();
    }

    public static void exibe06(){
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[20];
        for(int i=0; i<20; i++){
            System.out.println("informe o "+(i+1)+" idade:");
            idade[i] = scanner.nextInt();
        }

        int soma = (somaIdade(idade));
        System.out.println("Soma das idades: "+soma);
        scanner.close();

    }

    public static void exibe07(){
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[20];
        for(int i=0; i<20; i++){
            System.out.println("informe o "+(i+1)+" idade:");
            idade[i] = scanner.nextInt();
        }

        double media = (somaIdade(idade)/20);
        System.out.println("Media das idades: "+media);
        scanner.close();

    }

    public static void exibe08(){
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[20];
        int cont = 0;
        for(int i=0; i<20; i++){
            System.out.println("informe o "+(i+1)+" idade:");
            idade[i] = scanner.nextInt();
            if (idade[i] >= 18){
                cont++;
            }
        }scanner.close();
        System.out.println(cont+" pessoas são maiores que 18 anos.");
    }

    public static void exibe09(){
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[10];
        String[] nome = new String[10];
        int cont = 0;
        int index = 0;
        for(int i=0; i<10; i++){
            scanner = new Scanner(System.in);
            System.out.println("informe o "+(i+1)+" nome:");
            nome[i] = scanner.nextLine();

            System.out.println("informe a idade:");
            idade[i] = scanner.nextInt();
            System.out.println(i);
            if ((i > 0)){
                if (idade[i] <= idade[index]) {
                    index = i;
                }
            }
        }scanner.close();
        System.out.println("A pessoa mais nova é "+nome[index]+" com "+idade[index]+" anos.");
    }

    public static void exibe10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numero = scanner.nextInt();

        System.out.println("A tabuada do número "+numero+" é:");
        for (int i = 0; i <= 10; i++){
            System.out.println(numero+" * "+i+" = "+(numero * i));
        }
        scanner.close();
    }

    public static void exibe11(){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[20];
        int cont = 0;
        for(int i=0; i<20; i++){
            System.out.println("informe o "+(i+1)+" numero:");
            numero[i] = scanner.nextInt();
            if (numero[i] > 8){
                cont++;
            }
        }scanner.close();
        System.out.println(cont+" números são maiores que 8.");
    }

    public static void exibe12(){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[20];
        int cont = 0;
        for(int i=0; i<20; i++){
            System.out.println("informe o "+(i+1)+" numero:");
            numero[i] = scanner.nextInt();
            if ((numero[i] % 2) == 0){
                cont++;
            }
        }scanner.close();
        System.out.println(cont+" números são pares.");
    }

    public static void exibe13(){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[20];
        int cont = 0;
        for(int i=0; i<20; i++){
            System.out.println("informe o "+(i+1)+" numero:");
            numero[i] = scanner.nextInt();
            if ((numero[i] >= 0) && (numero[i] <= 100)){
                cont++;
            }
        }
        scanner.close();
        System.out.println(cont+" números estão entre 0 e 100");
    }

    public static void exibe14(){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[20];
        int de0A100 = 0;
        int de101A200 = 0;
        int maiorQue200 = 0;
        for(int i=0; i<20; i++){
            System.out.println("informe o "+(i+1)+" numero:");
            numero[i] = scanner.nextInt();
            if ((numero[i] >= 0) && (numero[i] <= 100)){
                de0A100++;
            }else if((numero[i] >= 101) && (numero[i] <= 200)){
                de101A200++;
            }else if(numero[i] >= 201){
                maiorQue200++;
            }
        }
        scanner.close();
        System.out.println(de0A100+" números estão entre 0 e 100");
        System.out.println(de101A200+" números estão entre 101 a 200");
        System.out.println(maiorQue200+" números estão acima de 200");
    }

    public static void exibe15(){
        int numero = 0;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Informe o numero:");
            numero = scanner.nextInt();
            if(numero < 0){
                break;
            }
            soma+=numero;
            System.out.println(" ");
            System.out.println("Soma: "+soma);
            System.out.println("Digite um número negativo para  sair ou informe outro número para a soma.");
        }
    }

}
