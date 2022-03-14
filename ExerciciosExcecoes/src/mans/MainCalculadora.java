package mans;
import classes.Calculadora;
;

public class MainCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.divide(1,0));
    }
}
