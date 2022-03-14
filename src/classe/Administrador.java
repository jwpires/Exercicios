package classe;

public class Administrador extends Empregado{

    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario(Empregado empregado){
        double salarioLiquido = this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto() / 100));
        return salarioLiquido + this.getAjudaDeCusto();
    }


    @Override
    public String toString() {
        return "Administrador :" +
                "\nNome : " + getNome() +
                ", \nEndereco : " + getEndereco() +
                ", \nTelefone : " + getTelefone() +
                ", \nCódigo do Setor :" + getCodigoSetor() +
                ", \nSalário Base :" + getSalarioBase() +
                ", \nimposto : " + getImposto() +"%"+
                ", \nAjuda De Custo : " + getAjudaDeCusto();
    }
}
