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
            for (int j = 0, numero = gerador.nextInt(100); j < matriz1[i].length; j++){

                //chama função criada abaixo do exercicio
                while (validaMatriz(matriz1, numero) == true){
                    numero = gerador.nextInt(100);
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
        int[] resultado = new int[5];
        String opc = new String();
        int pontos = 0;


        for (int i = 0; i < respAlunos.length; i++){
            System.out.println((i+1)+" Aluno:");
            pontos = 0;
            for (int j = 0; j<respAlunos[i].length; j++){
                System.out.println("Informe a resposta da questão de numero "+(1+j)+":");
                opc = scan.next();

                if(opc.charAt(0) == 'a' || opc.charAt(0) == 'b' || opc.charAt(0) == 'c' || opc.charAt(0) == 'd' || opc.charAt(0) == 'e'){
                    respAlunos[i][j] = opc.charAt(0);
                    if(respAlunos[i][j] == gabarito[j]){
                        pontos++;
                    }
                }
            }
            resultado[i] = pontos;
        }
        for (int i = 0; i < resultado.length; i++){
            System.out.println("Pontos do "+(i+1)+"° aluno(a): "+resultado[i]);
        }
    }

    public static void exercicio16(){
        Scanner scan = new Scanner(System.in);
        char[][] respAlunos = new char[3][10];
        int[] matricula = new int[3];
        char[] gabarito = {'a','c','c','b','e','e','d','b','a','d'};
        int[] resultado = new int[5];
        String opc = new String();
        int pontos = 0;


        for (int i = 0; i < respAlunos.length; i++){
            System.out.println((i+1)+" Aluno:");
            System.out.println("Informe o numero da matricula do aluno:");
            matricula[i] = scan.nextInt();
            pontos = 0;
            for (int j = 0; j<respAlunos[i].length; j++){
                System.out.println("Informe a resposta da questão de numero "+(1+j)+":");
                opc = scan.next();

                if(opc.charAt(0) == 'a' || opc.charAt(0) == 'b' || opc.charAt(0) == 'c' || opc.charAt(0) == 'd' || opc.charAt(0) == 'e'){
                    respAlunos[i][j] = opc.charAt(0);
                    if(respAlunos[i][j] == gabarito[j]){
                        pontos++;
                    }
                }
            }
            resultado[i] = pontos;
        }
        for (int i = 0; i < respAlunos.length; i++){
            System.out.println("Aluno "+(i+1)+" Matricula: "+matricula[i]+" Respostas:");
            for (int j = 0; j < respAlunos[i].length; j++){
                System.out.println("Questão "+(j+1)+"; resposta: "+respAlunos[i][j]+"; Gabarito:"+gabarito[j]);
            }
            System.out.print("Nota final: "+resultado[i]);
            if(resultado[i] >= 7){
                System.out.println(", Aprovado");
            }else {
                System.out.println(", Reprovado");
            }
            System.out.println("");
        }
    }

    public static void exercicio17(){
        Scanner scan = new Scanner(System.in);
        int[][] respAlunos = new int[3][3];
        int[] nota = new int[3];

        for (int i = 0; i < respAlunos.length; i++){
            System.out.println((i+1)+" Aluno:");

            for (int j = 0; j<respAlunos[i].length; j++){
                System.out.println("Informe a "+(1+j)+" nota:");
                respAlunos[i][j] = scan.nextInt();
                if ( j > 0){
                    if (respAlunos[i][j] < respAlunos[i][j-1]){
                        nota[i] = respAlunos[i][j];
                    }else {
                        nota[i] = respAlunos[i][j-1];
                    }
                }
            }
        }

        for (int i = 0, cont =0; i < respAlunos.length; i++){
            for (int j = 0; j < respAlunos[i].length; j++){
                cont = contador(respAlunos[i], nota[i]);
            }
            System.out.println("Quantidade de alunos que tiraram pior nota na "+(i+1)+" prova: "+cont);
            cont=0;
        }

    }

    public static int contador (int[] vetor, int nota){
        int cont=0;
        for (int i = 0; i < vetor.length; i++){
            if(nota ==  vetor[i]){
                cont++;
            }
        }
        return cont;
    }


    public static void exercicio18() {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] vetor = {0,0,0};

        for (int i=0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.println("Informe valor da matriz["+i+"]["+j+"]:");
                matriz[i][j] = scan.nextInt();
                vetor[j]+=matriz[i][j];
            }
        }

        for (int i=0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                if(matriz[i][j] < 10){
                    System.out.print(" | 0"+matriz[i][j]);
                }else {
                    System.out.print(" | "+matriz[i][j]);
                }

            }
            System.out.println("");
        }
        System.out.println("-----------------");
        for (int mostra: vetor){
            if(mostra < 10){
                System.out.print(" | 0"+mostra);
            }else {
                System.out.print(" | "+mostra);
            }
        }

    }


    public static void exercicio19() {
        Scanner scan = new Scanner(System.in);
        int[][] AlunoInf = new int[5][4];
        double media =0;
        int index = 0;

        for (int i=0; i<AlunoInf.length; i++){
            System.out.println((i+1)+"º Aluno:");
            for (int j = 0; j<AlunoInf[i].length; j++){
                if (j==0){
                    System.out.println("Matricula:");
                    AlunoInf[i][j]= scan.nextInt();
                }else if(j == 1){
                        System.out.println("Media provas:");
                        AlunoInf[i][j]= scan.nextInt();
                        AlunoInf[i][(AlunoInf[i].length)-1] = AlunoInf[i][j];
                }else if(j == 2){
                    System.out.println("Media trabalhos:");
                    AlunoInf[i][j]= scan.nextInt();
                    AlunoInf[i][(AlunoInf[i].length)-1]+= AlunoInf[i][j];
                }else {
                    AlunoInf[i][j] = AlunoInf[i][j] / 2;
                    media += AlunoInf[i][j];
                }

            }
        }

        for (int i = 0; i < AlunoInf.length; i++){
            if (i > 0){
                if( AlunoInf[i][(AlunoInf[i].length)-1] >  AlunoInf[i-1][(AlunoInf[i].length)-1]){
                    index = i;
                }
            }
        }
        System.out.println("Aluno com a maior nota tem matrícula de numero: "+AlunoInf[index][0]+" Nota:"+AlunoInf[index][(AlunoInf[index].length)-1]);
        media /= 2;
        System.out.println("A média das notas finais são: "+media);

    }


    /*
     20. Fac¸a programa que leia uma matriz 3 x 6 com valores reais.
(a) Imprima a soma de todos os elementos das colunas ´ımpares.
(b) Imprima a media aritm ´ etica dos elementos da segunda e quarta colunas. ´
(c) Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
(d) Imprima a matriz modificada.
*/
    public static void exercicio20() {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        double[][] matriz = new double[3][6];
        double somaImpar = 0;

        for (int i = 0;i<matriz.length; i++ ){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j]= gerador.nextInt(100);
                System.out.print(" | "+matriz[i][j]+" | ");
                if ( j%2 != 0){
                    somaImpar += matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Soma elementos colunas impares: "+somaImpar);

    }




}
