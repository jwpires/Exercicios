import java.util.Scanner;

public class Main {

    public static  void main(String []args){
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Informe qual exercicio deseja exibir digitando entre 1 a 25:");
        opcao = scan.nextInt();

        switch (opcao){
            case 1 : ExerciciosMatriz.exercicio01();
                break;
            case 2 : ExerciciosMatriz.exercicio02();
                break;
            case 3 : ExerciciosMatriz.exercicio03();
                break;
            case 4 : ExerciciosMatriz.exercicio04();
                break;
            case 5 : ExerciciosMatriz.exercicio05();
                break;
            case 6 : ExerciciosMatriz.exercicio06();
                break;
            case 7 : ExerciciosMatriz.exercicio07();
                break;
            case 8 : ExerciciosMatriz.exercicio08();
                break;
            case 9 : ExerciciosMatriz.exercicio09();
                break;
            case 10 : ExerciciosMatriz.exercicio10();
                break;
            case 11 : ExerciciosMatriz.exercicio11();
                break;
            case 12 : ExerciciosMatriz.exercicio12();
                break;
            case 13 : ExerciciosMatriz.exercicio13();
                break;
            case 14 : ExerciciosMatriz.exercicio14();
                break;
            case 15 : ExerciciosMatriz.exercicio15();
                break;
            case 16 : ExerciciosMatriz.exercicio16();
                break;
            case 17 : ExerciciosMatriz.exercicio17();
                break;
            case 18 : ExerciciosMatriz.exercicio18();
                break;
            case 19 : ExerciciosMatriz.exercicio19();
                break;
            case 20 : ExerciciosMatriz.exercicio20();
                break;



        }



    }
}