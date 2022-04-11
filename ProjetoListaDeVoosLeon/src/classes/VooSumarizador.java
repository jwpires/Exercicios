package classes;


import java.math.BigDecimal;

public class VooSumarizador {

    long menorVoo;
    long maiorVoo;
    BigDecimal vooMaisBarato;
    BigDecimal vooMaisCaro;
    float tempoMedio;
    BigDecimal precoMedio;

    public VooSumarizador(long menorVoo, long maiorVoo, BigDecimal vooMaisBarato, BigDecimal vooMaisCaro, float tempoMedio, BigDecimal precoMedio)
    {
        this.menorVoo = menorVoo;
        this.maiorVoo = maiorVoo;
        this.vooMaisBarato = vooMaisBarato;
        this.vooMaisCaro = vooMaisCaro;
        this.tempoMedio = tempoMedio;
        this.precoMedio = precoMedio;
    }

    @Override
    public String toString()
    {
        return menorVoo+ ";" + maiorVoo + ";" + vooMaisBarato + ";" + vooMaisCaro + ";" + tempoMedio + ";" + precoMedio;
    }

}
