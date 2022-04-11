package Mains;
/*
Identificar atividades:
        - leitura de arquivo (Feito com NIO2)
        - mapear objeto que representarah a linha (Feito)
        - converter cada linha em objeto: lista de objetos (Feito)
        - realizar operacoes sobre streams: (Feito)
        - operacao java time (calcular intervalo tempo) (Feito)
        - agrupar por origem/destino (Feito)
        - ordenacao (Feito)
        - operacoes de sumarizacao (Feito)
        - geracao de arquivos (Feito)
*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;


import classes.*;

public class Projeto {

    public static void main(String[] args){


        // Lê o arquivo e retorna uma lista com de String
        List<Voo> listaDeVoo = GerenciadorDeArquivos.leLinhas("C:\\Users\\josew\\Desktop\\Curso Java\\Projeto\\src\\Arquivos\\flights.csv")
                .stream().skip(1).map(Voo::new).collect(Collectors.toList());
        //System.out.println(listaDeVoo);
        //listaDeVoo.forEach(System.out::println);

        // Cria arquivo com Horas por Voo
        GerenciadorDeArquivos.escreveLinhas("C:\\Users\\josew\\Desktop\\Curso Java\\Projeto\\src\\Arquivos\\flighrsComHorasdeVoo.csv",
                listaDeVoo.stream().map(Voo::escreveLinhaNoArquivo).toArray(String[]::new),"origin;destination;airline;departure;arrival;price;time");

        Map<String, VooSumarizador> mapSumarizadorDeVoo = listaDeVoo.stream().collect(Collectors.
                groupingBy(Voo::getRota)).entrySet().stream().map(Projeto::mapToSumarizador).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        //Gera o segundo arquivo com agrupados por ordem
        GerenciadorDeArquivos.escreveLinhas("C:\\Users\\josew\\Desktop\\Curso Java\\Projeto\\src\\Arquivos\\flightsAgrupadoOrdenado.csv",
                mapSumarizadorDeVoo.entrySet().stream().map(e -> e.getKey() + ";" +
                        e.getValue().toString()).toArray(String[]::new),
                "origin;destination;shortest-flight(h);longest-fight(h);cheapest-flight;most-expensive-flight;average-time;average-price");
    }

    private static Map.Entry<String, VooSumarizador> mapToSumarizador(Map.Entry<String, List<Voo>> entry)
    {
        List<Voo> voo = entry.getValue();
        long menorVoo = voo.stream().mapToLong(Voo::getTempoVoo).min().getAsLong();
        long maiorVoo = voo.stream().mapToLong(Voo::getTempoVoo).max().getAsLong();
        BigDecimal vooMaisBarato = BigDecimal.valueOf(voo.stream().map(Voo::getPreco).min(Comparator.naturalOrder()).get());
        BigDecimal vooMaisCaro = BigDecimal.valueOf(voo.stream().map(Voo::getPreco).max(Comparator.naturalOrder()).get());
        double tempoMedio = voo.stream().mapToLong(Voo::getTempoVoo).average().getAsDouble();
        BigDecimal precoMedio = average(voo.stream().map(v-> new BigDecimal(v.getPreco()) ).collect(Collectors.toList()));


        return Map.entry(entry.getKey(), new VooSumarizador(menorVoo, maiorVoo, vooMaisBarato, vooMaisCaro, (float) tempoMedio, precoMedio));
    }

    public static BigDecimal average(List<BigDecimal> bigDecimals)
    {
        BigDecimal sum = bigDecimals.stream().map(Objects::requireNonNull).reduce(BigDecimal.ZERO, BigDecimal::add);
        return sum.divide(new BigDecimal(bigDecimals.size()), RoundingMode.HALF_UP);
    }


}
