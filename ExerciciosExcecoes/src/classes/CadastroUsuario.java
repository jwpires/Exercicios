package classes;

/*
2. Considere um cadastro de um cliente, no qual vamos precisar receber informações digitadas em console
referentes ao nome, cpf e a renda mensal da pessoa.

        Assim que o cadastro for realizado, imprima em console a mensagem “Cadastro realizado com sucesso”
        seguido do nome, cpf e renda informados.

        Trate a exceção de casos nos quais os valores foram digitados incorretamente em console (exemplo:
        letra informada em campo numérico).

        Após informar que o usuário incluiu um valor inválido, dê uma nova chance para ele fazer o cadastro.
        Se o usuário errar 3 vezes, finalize o processamento.
*/


public class CadastroUsuario {

    private long cpf;
    private String nome;
    private double renda;

    public CadastroUsuario(long cpf, String nome, double renda){
        this.nome = nome;
        this.cpf = cpf;
        this.renda = renda;
    }
    public CadastroUsuario(){}

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public long getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    public double getRenda() {
        return renda;
    }

}
