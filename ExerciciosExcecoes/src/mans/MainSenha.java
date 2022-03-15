package mans;
import classes.SenhaUsuario;

import javax.swing.*;
import java.util.Scanner;

public class MainSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha;
        int n1, n2;


        SenhaUsuario usuario = new SenhaUsuario();

        System.out.println("informe a senha de acesso:");
        senha = scan.next();
        usuario.setSenha(senha);

        do {
            System.out.println("Informe o primeiro número:");
            n1 = scan.nextInt();
            System.out.println("Informe o segundo número:");
            n2 = scan.nextInt();
            usuario.divide(n1,n2);
        }while (n2 == 0);

        System.out.println("informe a sua senha para visualizar o resultado:");
        scan = new Scanner(System.in);
        senha = scan.nextLine();
        if (usuario.validaSenha(senha) == false){
            System.out.println("Erro! Senha inválida!");
        }else System.out.println("Resultado: "+usuario.getResult());


    }
}
