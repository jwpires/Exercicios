package classe;

public class Empregado extends Pessoa{

    private int codigoSetor;

    private double salarioBase;

    private double imposto;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }


    public Empregado(int codigoSetor, double salarioBase, double imposto) {
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, int codigoSetor, double salarioBase, double imposto) {
        super(nome);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public double calcularSalario(Empregado empregado){
        double salarioLiquido = this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto() / 100));

        return salarioLiquido;
    }

    @Override
    public String toString() {
        return "\nEmpregado :" +
                "\nNome : " + getNome() +
                ", \nEndereco : " + getEndereco() +
                ", \nTelefone : " + getTelefone() +
                ", \nCódigo do Setor :" + getCodigoSetor() +
                ", \nSalário Base :" + getSalarioBase() +
                ", \nimposto: " + getImposto()+"%" ;
    }
}