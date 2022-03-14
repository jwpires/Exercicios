package classe;

/*Exercício 01
        Nesta atividade vocês deverão criar uma classe Funcionário com os seguintes
        atributos:
        ● Nome
        ● Sobrenome
        ● Cidade
        ● Estado
        ● Horas Trabalhadas
        ● Valor Por Hora
       */
public class Funcionario {

    private String nome, sobrenome, cidade ,estado;
    private double horasTrabalhadas = 0;
    private double valorPorHora =  0;




    // Adicionar um construtor default e um construtor com os valores para inicializar o objeto
    //construtor com os valores

    public Funcionario( String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    //construtor default
    public Funcionario(){

    }

    //Este funcionário deverá ter os seguintes métodos:

    public String getNome(){
        return this.nome;
    }

    public String getSobreNome(){
        return this.sobrenome;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    public double getValorPorHora(){
        return this.valorPorHora;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    // Exibir na tela o nome e sobrenome
    public void exibirNomeCompleto(String nome, String sobrenome, double horasTrabalhadas, double valorPorHora){
        System.out.println("Nome completo: "+this.nome+" "+this.sobrenome+".");
    }

    //Incrementar quantidade de horas no valor atual de horas trabalhadas
    public void incrementarHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas+= horasTrabalhadas;
        System.out.println("Valor incrementado: "+this.horasTrabalhadas);
    }

    /*Receber novo valor por hora trabalhada por parâmetro e alterar o valor por
    hora do funcionário e logo em seguida exibir o novo valor na tela*/
    public void alterarValorPorHora(double novoValorPorHora){
        this.valorPorHora = novoValorPorHora;
        System.out.println("Valor por hora trabalhado foi alterado para: "+this.valorPorHora);
    }


    /*Método para calcular o salário que o funcionário receberá no final do mês,
    e em seguida imprimir o valor.*/
    public void salario(){

        System.out.println("Salario a ser recebido: "+(this.valorPorHora*this.horasTrabalhadas));
    }

}
