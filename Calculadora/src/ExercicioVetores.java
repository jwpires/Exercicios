import java.text.DecimalFormat;
import java.util.Scanner;


public class ExercicioVetores {

    public static void exercicio03(){
        double[] nota = new double[4];
        double media =0.0;
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<4; i++){
            System.out.println("Informe a "+(i+1)+" nota.");
            media+= nota[i] = scan.nextInt();
        }
        System.out.println("A média das notas é:"+media/4);
    }

    public static void exercicio04(){
        int cont =0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva uma frase ou qualquer informação sem números");
        String palavra = scan.nextLine();
        char[] consoantes = palavra.toCharArray();
        for(int i=0; i< consoantes.length; i++){
            if((consoantes[i] == 'a') || (consoantes[i] == 'A') || (consoantes[i] == 'e') || (consoantes[i] == 'E') ||
            (consoantes[i] == 'i') || (consoantes[i] == 'I') || (consoantes[i] == 'o') || (consoantes[i] == 'O') ||
                    (consoantes[i] == 'u') || (consoantes[i] == 'U') || (consoantes[i] == ' ')) {
                cont++;
            }
        }
        System.out.println("A quantidade de consoantes são: "+ (consoantes.length - cont));
    }

    public static void exercicio05(){
        int[] numeros = new int[10];
        int qtdPar =0;
        int index = 0;
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Informe o "+(i+1)+" número:");
            numeros[i]= scan.nextInt();
            if((numeros[i] % 2) == 0) {
                qtdPar++;
            }
        }
        if (qtdPar > 0){
            int qtdImpar = numeros.length - qtdPar;
            if (qtdImpar > 0){
                int[] numeroPar = new int[qtdPar];
                int[] numeroImpar = new  int[(qtdImpar)];
                System.out.println("Vetor original");
                for (int i =0; i < numeros.length; i++){
                    System.out.println("v["+(i+1)+"] = "+numeros[i]);
                }
                System.out.println("Vetor dos Pares: ");
                for (int i = 0; i < numeros.length; i++){
                    if((numeros[i] % 2) == 0) {
                        numeroPar[index] = numeros[i];
                        index++;
                    }
                }
                for (int i=0; i < numeroPar.length; i++){
                    System.out.println("v["+(i+1)+"] = "+numeroPar[i]);
                }

                System.out.println("Vetor dos Impares: ");
                index=0;
                for (int i = 0; i < numeros.length; i++){
                    if((numeros[i] % 2) != 0) {
                        numeroImpar[index] = numeros[i];
                        index++;
                    }
                }
                for (int i=0; i < numeroImpar.length; i++){
                    System.out.println("v["+(i+1)+"] = "+numeroImpar[i]);
                }
            }else {
                System.out.println("Todos valores do Vetor original são par");
                for (int i =0; i < numeros.length; i++){
                    System.out.println("v["+(i+1)+"] = "+numeros[i]);
                }
            }
        }else {
            System.out.println("Todos valores do Vetor original são impar");
            for (int i =0; i < numeros.length; i++){
                System.out.println("v["+(i+1)+"] = "+numeros[i]);
            }
        }

    }

    public static void exercicio06(){
        Scanner scan = new Scanner(System.in);
        double[] media = new double[10];
        double soma = 0;

        for (int i = 0; i < media.length; i++){
            System.out.println(i+1+". Aluno: ");
            System.out.println();
            for (int j=0; j < 4; j++){
                System.out.println("Informe a "+(j+1)+" nota");
                soma+= scan.nextInt();
                if ( j == 3){
                    media[i] = soma / 4;
                    soma = 0.0;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < media.length; i++){
            if (media[i] > 7.0){
                System.out.println(i+1+". Aluno média: "+ media[i]);
                System.out.println();
            }
        }
    }

    public static void exercicio07(){
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int mult = 1;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Informe o "+(1+i)+" numero: ");
            numeros[i]= scan.nextInt();
            soma+= numeros[i];
            mult*= numeros[i];
        }

        System.out.println("Valores do vetor:");
        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("Valor da soma: "+soma);
        System.out.println();
        System.out.println("Valor da multiplicação: "+mult);
    }

    public static void exercicio08() {
        Scanner scan = new Scanner(System.in);
        int[] idade = new int[5];
        double[] altura = new double[5];

        for (int i=0; i<idade.length; i++){
            System.out.println((1+i)+".Pessoa:");
            System.out.println("Idade: ");
            idade[i] = scan.nextInt();
            System.out.println("Altura: ");
            altura[i] = scan.nextDouble();
            System.out.println();
        }

        for (int i=(idade.length-1); i >= 0; i--){
            System.out.println((1+i)+".Pessoa:");
            System.out.println("Idade: "+idade[i]);
            System.out.println("Altura: "+altura[i]);
        }

    }

    public static void exercicio09() {
        Scanner scan = new Scanner(System.in);
        int[] valores = new int[10];
        int soma = 0;

        for (int i = 0; i < valores.length; i++){
            System.out.println("Informe o "+(i+1)+" numero:");
            valores[i] = scan.nextInt();
            soma+= Math.pow(valores[i],2);
        }
        for (int i = 0; i < valores.length; i++){
            System.out.println("vetor["+(i+1)+"]: "+valores[i]+" ^2: "+Math.pow(valores[i],2));
        }
        System.out.println("Soma: "+soma);

    }

    public static void exercicio10() {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorJuncao = new  int[20];
        //int index = 0;
        for (int i = 0; i<vetor1.length; i++){
            vetor1[i] = i+1;
            vetor2[i] = i+101;
        }

        for (int i = 0, index = 0; i < vetor2.length; i++){
                vetorJuncao[index] = vetor1[i];
                vetorJuncao[index+1] = vetor2[i];
            index += 2;
            System.out.println("Vetor1["+(i+1)+"]: "+vetor1[i]+"  ;  Vetor2["+(i+1)+"]: "+vetor2[i]);
        }
        System.out.println("");
        System.out.println("Vetor Junção:");
        for (int i = 0; i < vetorJuncao.length; i++){
            System.out.println("VetorJunção["+(i+1)+"]: "+vetorJuncao[i]);
        }

    }

    public static void exercicio11() {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        int[] vetorJuncao = new  int[30];
        int index = 0;
        for (int i = 0; i<vetor1.length; i++){
            vetor1[i] = i+1;
            vetor2[i] = i+201;
            vetor3[i] = i+301;
        }

        for (int i = 0; i < vetor2.length; i++){
            vetorJuncao[index] = vetor1[i];
            vetorJuncao[index+1] = vetor2[i];
            vetorJuncao[index+2] = vetor3[i];
            index += 3;
            System.out.println("Vetor1["+(i+1)+"]: "+vetor1[i]+"  ;  Vetor2["+(i+1)+"]: "+vetor2[i]+"  ;  Vetor3["+(i+1)+"]: "+vetor3[i]);
        }
        System.out.println("Vetor Junção:");
        for ( int numeros: vetorJuncao){
            System.out.println(numeros);
        }
    }

    public static void exercicio12() {
        Scanner scan = new Scanner(System.in);
        int[] idade = new int[30];
        double[] altura = new double[30];
        double mediaAltura = 0.0;
        int cont = 0;

        for (int i=0; i<idade.length; i++){
            System.out.println((1+i)+".Aluno:");
            System.out.println("Idade: ");
            idade[i] = scan.nextInt();
            System.out.println("Altura: ");
            altura[i] = scan.nextDouble();
            mediaAltura+= altura[i];
            System.out.println();
        }
        mediaAltura/= altura.length;
        for (int i=0; i < idade.length; i++){
            if ((idade[i] > 13) && (altura[i] < mediaAltura)){
                cont++;
            }
        }

        System.out.println("Quantidade de Alunos maiores de 13 anos com altura inferior a "+mediaAltura+" é: "+cont);

    }

    public static void exercicio13() {
        Scanner scan = new Scanner(System.in);
        double[] temperatura = new double[12];
        double media = 0;

        System.out.println("Informe a temperatura referente aos mês:");
        for (int i =0; i < temperatura.length; i++){
            if (i<9){
                System.out.println("0"+(1+i)+"/22: ");
            }else{
                System.out.println((1+i)+"/22: ");
            }
            temperatura[i]= scan.nextDouble();
            media+=temperatura[i];
        }
        media/=temperatura.length;
        System.out.println("Media anual de:"+media+"°C");
        for (int i=0; i<temperatura.length; i++){
           if (temperatura[i] > media){
               switch (i+1){
                   case 1: System.out.println("Mês de Janeiro acima da média com "+temperatura[i]+"°C");
                        break;

                   case 2: System.out.println("Mês de Fevereiro acima da média com "+temperatura[i]+"°C");
                       break;

                   case 3: System.out.println("Mês Março acima da média com "+temperatura[i]+"°C");
                       break;

                   case 4: System.out.println("Mês Abril acima da média com "+temperatura[i]+"°C");
                       break;

                   case 5: System.out.println("Mês Maio acima da média com "+temperatura[i]+"°C");
                       break;

                   case 6: System.out.println("Mês Junho acima da média com "+temperatura[i]+"°C");
                       break;

                   case 7: System.out.println("Mês Julho acima da média com "+temperatura[i]+"°C");
                       break;

                   case 8: System.out.println("Mês Agosto acima da média com "+temperatura[i]+"°C");
                       break;

                   case 9: System.out.println("Mês Setembro acima da média com "+temperatura[i]+"°C");
                       break;

                   case 10: System.out.println("Mês Outubro acima da média com "+temperatura[i]+"°C");
                       break;

                   case 11: System.out.println("Mês Novembro acima da média com "+temperatura[i]+"°C");
                       break;

                   case 12: System.out.println("Mês Dezembro acima da média com "+temperatura[i]+"°C");
                       break;
               }
           }
        }
    }

    public static void exercicio14(){
        int[] numeros = new int[10];
        int qtdPar =0;
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Informe o "+(i+1)+" número:");
            numeros[i]= scan.nextInt();
            if((numeros[i] % 2) == 0) {
                qtdPar++;
            }
        }
        if (qtdPar > 0){
            System.out.println("Quantidade de numeros par: "+qtdPar);
            for(int i=0; i<numeros.length; i++){
                if((numeros[i] % 2) == 0) {
                    System.out.println(numeros[i]);
                }
            }
        }else System.out.println("Não foi informado nenhum número pares.");

        if ((numeros.length-qtdPar) > 0){
            System.out.println("Quantidade de numeros impares: "+(numeros.length-qtdPar));
            for(int i=0; i<numeros.length; i++){
                if((numeros[i] % 2) != 0) {
                    System.out.println(numeros[i]);
                }
            }
        }else System.out.println("Não foi informado nenhum número impar.");

    }

    public static void exercicio15(){
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int cont = 0;
        int soma = 0;

        for (int i = 0 ; i<numeros.length; i++){
            System.out.println("Informe o "+(i+1)+" numero:");
            numeros[i]= scan.nextInt();
            if(numeros[i] > 0){
                soma+=numeros[i];
            }else {
                cont++;
            }
        }

        System.out.println("A quantidade de número(s) negativo(s) é: "+cont);
        System.out.println("A Soma dos números positivos é: "+soma);

    }

    public static void exercicio16() {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[50];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o " + (i + 1) + " numero: ");
            numeros[i] = scan.nextInt();
        }

        System.out.println("Impressão inversa do vetor:");
        for (int i = (numeros.length - 1); i >= 0; i--) {
            System.out.println("V[" + (i + 1) + "] : " + numeros[i]);
        }
    }

    public static void exercicio17(){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int cont = 0;
        int indexMaior = 0;
        int indexMenor = 0;
        for(int i=0; i<numeros.length; i++){

            System.out.println("informe o "+(i+1)+" numero:");
            numeros[i] = scanner.nextInt();

            if ((i > 0)){
                if (numeros[i] >= numeros[indexMaior]) {
                    indexMaior = i;
                }
                if (numeros[i] <= numeros[indexMenor]) {
                    indexMenor = i;
                }
            }
        }scanner.close();
        System.out.println("O maior valor do vetor é "+numeros[indexMaior]+" e sua posição é: "+indexMaior);
        System.out.println("O menor valor do vetor é "+numeros[indexMenor]+" e sua posição é: "+indexMenor);
    }

    public static void exercicio18(){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int indexMaior = 0;
        for(int i=0; i<numeros.length; i++){

            System.out.println("informe o "+(i+1)+" numero:");
            numeros[i] = scanner.nextInt();

            if ((i > 0)){
                if (numeros[i] >= numeros[indexMaior]) {
                    indexMaior = i;
                }
            }
        }scanner.close();
        System.out.println("O maior valor do vetor é "+numeros[indexMaior]);
    }

    public static void exercicio19() {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[10];

        for (int i = 0; i<2; i++){
            for (int j = 0; j<v1.length; j++){
                if (i < 1) {
                    System.out.println("V1["+(j+1)+"]:");
                    v1[j]= scanner.nextInt();
                }else {
                    System.out.println("V2["+(j+1)+"]:");
                    v2[j]= scanner.nextInt();
                }
            }
        }

        for (int i = 0; i < v3.length; i++){
            v3[i] = v1[i]+v2[i];
            System.out.println("V3["+(i+1)+"]: "+v3[i]);
        }
    }

    public static void exercicio20(){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[12];
        double[] altura = new double[12];
        int index = 0;
        for(int i=0; i<numero.length; i++){

            System.out.println("informe o "+(i+1)+" numero:");
            numero[i] = scanner.nextInt();

            System.out.println("informe a altura:");
            altura[i] = scanner.nextDouble();

            if ((i > 0)){
                if (altura[i] >= altura[index]) {
                    index = i;
                }
            }
        }scanner.close();
        System.out.println("A pessoa mais alta mede "+altura[index]+" metros e usa o número "+numero[index]+".");
    }

    public static void exercicio21(){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[4];
        double[] altura = new double[4];
        int index = 0;
        double media=0.0;
        for(int i=0; i<numero.length; i++){

            System.out.println("informe o "+(i+1)+" numero:");
            numero[i] = scanner.nextInt();

            System.out.println("informe a altura:");
            altura[i] = scanner.nextDouble();
            media+=altura[i];

            if ((i > 0)){
                if (altura[i] >= altura[index]) {
                    index = i;
                }
            }
        }scanner.close();
        media/= altura.length;
        System.out.println("A altura média do time é: "+media+".");
    }

    public static void exercicio22() {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[5];
        double[] v4 = new double[5];

        for (int i = 0; i<3; i++){
            for (int j = 0; j<v1.length; j++){
                if (i < 1) {
                    System.out.println("V1["+(j+1)+"]:");
                    v1[j]= scanner.nextInt();
                }else if (i < 2){
                    System.out.println("V2["+(j+1)+"]:");
                    v2[j]= scanner.nextInt();
                    while (v2[j]==0){
                        System.out.println("Número não pode ser zero. Informe outro valor:");
                        System.out.println("V2["+(j+1)+"]:");
                        v2[j]= scanner.nextInt();
                    }
                } else {
                    System.out.println("V3["+(j+1)+"]:");
                    v3[j]= scanner.nextInt();
                }
            }
        }

        for (int i = 0; i < v4.length; i++){
            v4[i]= (double) v1[i] * (double)v3[i] / (double)v2[i];
            System.out.println("V4["+(i+1)+"]: "+v4[i]);
        }
    }

    public static void exercicio23() {
        Scanner scanner = new Scanner(System.in);
        float[] v1 = new float[4];
        float[] v2 = new float[4];
        float[] v3 = new float[4];

        for (int i = 0; i < v1.length; i++) {

            System.out.println("Informe a " + (i + 1) + " nota para A:");
            v1[i] = scanner.nextFloat();
            System.out.println("Informe a " + (i + 1) + " nota para B:");
            v2[i] = scanner.nextFloat();
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Vetor impresso de forma inversa:");
        for (int i = v3.length-1 ; i >=0 ; i--) {
            v3[i] = (v1[i] * 4 + v2[i] * 6) / 10;
            System.out.println("Media: "+df.format(v3[i]));

        }
    }

    public static void exercicio24() {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[3];
        int[] v2 = new int[3];
        int[] v3 = new int[3];

        for (int i =0; i<v1.length; i++){
            System.out.println("Informe "+(i+1)+" numero para o vetor1:");
            v1[i]=scanner.nextInt();
            System.out.println("Informe "+(i+1)+" numero para o vetor2:");
            v2[i]=scanner.nextInt();
            v3[i] = v1[i] - v2[i];
        }
        System.out.println("Valores impares do v3:");
        for (int i = 0; i<v3.length; i++){

            if((v3[i] % 2) > 0){
                System.out.println(v3[i]);
            }
        }

    }

}
