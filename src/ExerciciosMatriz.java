import java.util.Scanner;
import  java.util.Random;

public class ExerciciosMatriz {

    public static void exercicio01(){
        Random gerador = new Random();
        int [][] matriz = new int[4][4];
        int cont = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
            matriz[i][j] = gerador.nextInt(30);
            System.out.println("Matriz["+i+"]["+j+"]: "+matriz[i][j]);
            if(matriz[i][j] > 10) cont++;
            }
        }
        System.out.println("A "+cont+" números maiores que 10;");

    }

    public static void exercicio02(){

        int [][] matriz = new int[5][5];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if(i==j){
                    matriz[i][j] = 1;
                }else {
                    matriz[i][j] = 0;
                }

                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }

    public static void exercicio03(){

        int [][] matriz = new int[5][5];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = i*j;
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }

    public static void exercicio04(){
        Random gerador = new Random();
        int [][] matriz = new int[4][4];
        int indexLinha = 0, indexColuna = 0;


        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = gerador.nextInt(100);
                System.out.println("Matriz["+i+"]["+j+"]: "+matriz[i][j]);
            }
        }

        for( int linha = 0, maior = 0 ; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if(matriz[linha][coluna] > maior){
                    maior = matriz[linha][coluna];
                    indexColuna = coluna;
                    indexLinha = linha;
                }
            }
        }
        System.out.println("Maior número da Matriz["+indexLinha+"]["+indexColuna+"]: "+matriz[indexLinha][indexColuna]);


    }

    public static void exercicio05(){
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        Random gerador = new Random();
        int [][] matriz = new int[5][5];



        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = gerador.nextInt(100);
                System.out.println("Matriz["+i+"]["+j+"]: "+matriz[i][j]);
            }
        }

        System.out.println("Informe um número para ser consultado na matriz:");
        numero = scan.nextInt();

        for( int linha = 0, cont = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if(matriz[linha][coluna] == numero){
                    System.out.println("Valor da Matriz["+linha+"]["+coluna+"]: "+matriz[linha][coluna]);
                    cont++;
                }
            }
            if ((linha == (matriz.length - 1)) && (cont == 0)){
                System.out.println("Numero não encontrado na matriz.");
            }
        }

    }

    public static void exercicio06(){
        Random gerador = new Random();
        int [][] matriz1 = new int[4][4];
        int [][] matriz2 = new int[4][4];
        int [][] matriz3 = new int[4][4];

        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                matriz1[i][j] = gerador.nextInt(100);
                matriz2[i][j] = gerador.nextInt(100);
                if (matriz1[i][j] > matriz2[i][j]){
                    matriz3[i][j] = matriz1[i][j];
                }else{
                    matriz3[i][j] = matriz2[i][j];
                }
                System.out.print("Matriz1["+i+"]["+j+"]: "+matriz1[i][j]);
                System.out.print("; Matriz2["+i+"]["+j+"]: "+matriz2[i][j]);
                System.out.println("; Matriz3["+i+"]["+j+"]: "+matriz3[i][j]);
            }
        }

    }

    public static void exercicio07(){
        int [][] matriz1 = new int[10][10];


        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                if( i < j){
                    matriz1[i][j] = 2*i - 7*j - 2;
                }else if (i > j){
                    matriz1[i][j] = (int) ((4*Math.pow(i,3)) - 5*Math.pow(j,2) + 1);
                }else {
                    matriz1[i][j] = (int) (3*Math.pow(i,2) - 1);
                }

                System.out.print("["+i+"]["+j+"]: "+matriz1[i][j]+"  ");

            }
            System.out.println();
        }
    }

    public static void exercicio08() {
        int[][] matriz1 = new int[3][3];
        Random gerador = new Random();
        int soma = 0;

        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                matriz1[i][j]= gerador.nextInt(100);
                if ( j > i){
                    soma+=matriz1[i][j];
                }
                System.out.print(" "+matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Somatória valores acima da diagonal: "+soma);


    }

    public static void exercicio09() {
        int[][] matriz1 = new int[3][3];
        Random gerador = new Random();
        int soma = 0;

        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                matriz1[i][j]= gerador.nextInt(100);
                if ( j < i){
                    soma+=matriz1[i][j];
                }
                System.out.print(" "+matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Somatória valores abaixo da diagonal: "+soma);
    }

    public static void exercicio10() {
        int[][] matriz1 = new int[3][3];
        Random gerador = new Random();
        int soma = 0;

        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                matriz1[i][j]= gerador.nextInt(100);
                if ( j == i){
                    soma+=matriz1[i][j];
                }
                System.out.print(" "+matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Somatória valores da diagonal: "+soma);

    }

    public static void exercicio11() {
        int[][] matriz1 = new int[3][3];
        Random gerador = new Random();
        int soma = 0;

        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                matriz1[i][j]= gerador.nextInt(100);
                if ( (j + i) == (matriz1.length -1 )){
                    soma+=matriz1[i][j];
                }
                System.out.print(" "+matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Somatória valores da diagonal secundária: "+soma);
    }

    public static void exercicio12() {
        int[][] matriz1 = new int[3][3];
        Random gerador = new Random();

        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                matriz1[i][j]= gerador.nextInt(100);
                System.out.print(" "+matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Matriz transposta" );

        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                System.out.print(" "+matriz1[j][i]+" ");
            }
            System.out.println("");
        }

    }

    public static void exercicio13() {
        int[][] matriz1 = new int[4][4];
        Random gerador = new Random();

        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                if (j > i){
                    matriz1[i][j] = 0;
                }else {
                    matriz1[i][j]= gerador.nextInt(19)+1;
                }
                System.out.print(" "+matriz1[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void exercicio14() {
        int[][] matriz1 = new int[5][5];
        Random gerador = new Random();
        System.out.println("****** B I N G O! ******");
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0, numero = gerador.nextInt(99); j < matriz1[i].length; j++){

                //chama função criada abaixo do exercicio
                while (validaMatriz(matriz1, numero) == true){
                    numero = gerador.nextInt(99);
                }
                matriz1[i][j] = numero;
                if(numero < 10){
                    System.out.print("0"+matriz1[i][j]+" | ");
                }else {
                    System.out.print(matriz1[i][j]+" | ");
                }

            }
            System.out.println();
        }


    }

    public static boolean validaMatriz(int[][] matriz, int numero){

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if(numero == matriz[linha][coluna]){
                    return true;
                }
            }
        }
        return false;
    }


    public static void exercicio15(){
        Scanner scan = new Scanner(System.in);
        char[][] respAlunos = new char[5][10];
        char[] gabarito = {'a','c','c','b','e','e','d','b','a','d'};
        int[] resultado = new int[10];
       String opc = new String();


        for (int i = 0; i < respAlunos.length; i++){
            System.out.println((i+1)+" Aluno:");
            for (int j = 0; j<respAlunos[i].length; j++){
                System.out.println("Informe a resposta da questão de numero "+(1+j)+":");
                opc = scan.next();

                if(opc.charAt(0) == 'a' || opc.charAt(0) == 'b' || opc.charAt(0) == 'c' || opc.charAt(0) == 'd' || opc.charAt(0) == 'e'){
                    if()
                }

            }
        }
    }

}
