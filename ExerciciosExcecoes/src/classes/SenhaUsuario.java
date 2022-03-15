package classes;

 /*Desenvolver programa que peça ao usuário para cadastrar uma senha; na sequência, deve pedir ao usuário
  que digite duas variáveis numéricas, e irá calcular a divisão da primeira pela segunda.

         O programa irá pedir ao usuário que digite a sua senha: se estiver correta, ela mostra o resultado
          da divisão. Senão dá mensagem de erro e encerra o aplicativo.

         Crie uma exceção exclusiva para tratar a entrada incorreta da senha.
*/

public class SenhaUsuario {
    private int result = 0;
    private String senha;

    public SenhaUsuario(){}

    public int getResult() {
        return result;
    }

    public boolean validaSenha(String senha){
        int index = this.senha.length();
        for (int i = 0; i < index; i++){
            try {
                if (this.senha.charAt(i) != senha.charAt(i)){
                    return false;
                }
            }catch (java.lang.StringIndexOutOfBoundsException e){
                return false;
            }
        }
        return true;
    }

    public int divide( int n1, int n2){
        try {
            result = n1 / n2;
        }catch (java.lang.ArithmeticException e){
            System.out.println("Número não pode ser divido por zero.");
            result = 0;
        }

        return result;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
