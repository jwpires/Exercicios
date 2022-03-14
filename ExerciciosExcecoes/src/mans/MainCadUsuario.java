package mans;
import java.util.Scanner;
import classes.CadastroUsuario;

public class MainCadUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadastroUsuario cadUsuario = new CadastroUsuario();

        System.out.println("informe seu nome:");
        String nome = scan.nextLine();
        cadUsuario.setNome(nome);



        for(int i = 0; i < 3; i++){
            try {
                System.out.println("informe seu CPF");
                scan = new Scanner(System.in);
                long cpf = scan.nextLong();
                cadUsuario.setCpf(cpf);
                break;
            }catch (java.util.InputMismatchException e){
                System.out.println("não é permitido letras para essa informação.");
                if (i == 2 ){
                    System.out.println("3 tentativas erradas, processo foi encerrado.");
                }
            }
        }

        for(int i = 0; i < 3; i++){
            try {
                System.out.println("informe sua renda");
                scan = new Scanner(System.in);
                double renda = scan.nextDouble();
                cadUsuario.setRenda(renda);
                System.out.println("Cadastro realizado com sucesso!");
                System.out.println("Nome: "+cadUsuario.getNome());
                System.out.println("CPF: "+cadUsuario.getCpf());
                System.out.println("Renda: "+cadUsuario.getRenda());
                break;
            }catch (java.util.InputMismatchException e){
                System.out.println("não é permitido letras ou '.' para essa informação. Utilize número com ','" +
                        "se necessário");
                if (i == 2 ){
                    System.out.println("3 tentativas erradas, processo foi encerrado.");
                }
            }
        }

    }
}
