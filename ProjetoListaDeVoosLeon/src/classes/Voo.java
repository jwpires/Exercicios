package classes;

import java.time.temporal.ChronoUnit;
import java.time.OffsetDateTime;


public class Voo{
    private String origem = "";
    private String destino = "";
    private String linhaAerea = "";
    private OffsetDateTime partidaDataHora;
    private OffsetDateTime chegadaDataHora;
    private double preco = 0;
    private long tempoVoo = 0;

   /*Construtor do objeto voo*/
    public Voo(String voo) {
        String[] separador = voo.split(";");
        if (separador.length != 6){
            System.out.println("Deu Ruim!");
            return;
        }

        this.origem = separador[0];
        this.destino = separador[1];
        this.linhaAerea = separador[2];
        this.partidaDataHora = converteData(separador[3]);
        this.chegadaDataHora = converteData(separador[4]);
        this.preco = Double.parseDouble(separador[5]);
        this.tempoVoo =  Math.abs(partidaDataHora.until(chegadaDataHora, ChronoUnit.HOURS));
    }

    private static OffsetDateTime converteData(String data)
    {
        String[] dataSplit = data.split(" ");
        String[] dataSplit2 = dataSplit[0].split("/");
        String[] tempoSplit = dataSplit[1].split(":");

        return OffsetDateTime.of(Integer.parseInt(dataSplit2[2]), Integer.parseInt(dataSplit2[1]), Integer.parseInt(dataSplit2[0]), Integer.parseInt(tempoSplit[0]), Integer.parseInt(tempoSplit[1]), Integer.parseInt(tempoSplit[2]), 0, OffsetDateTime.now().getOffset());
    }

    //Escreve cada linha no arquivo com horas de voo
    public String escreveLinhaNoArquivo()
    {
        return this.origem + ";" + this.destino + ";" + this.linhaAerea + ";" + this.partidaDataHora.toString() + ";" + this.chegadaDataHora.toString() + ";" + Double.toString(this.preco) + ";" + this.tempoVoo + " Hours";

    }

    public String getRota()
    {
        return this.origem + ";" + this.destino;
    }

    /*Get e Set (inicio)*/

    public long getTempoVoo() {
        return tempoVoo;
    }

    public String getOrigem() {
        return origem;
    }

   public String getDestino() {
        return destino;
    }

    public String getLinhaAerea() {
        return linhaAerea;
    }

    public OffsetDateTime getPartidaDataHora() {
        return partidaDataHora;
    }

    public OffsetDateTime getChegadaDataHora() {
        return chegadaDataHora;
    }

    public double getPreco() {
        return preco;
    }

    /*Get e Set (Fim)*/

    @Override
    public String toString() {
        return "Voo{" +
                "origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", linhaAerea='" + linhaAerea + '\'' +
                ", partidaDataHora='" + partidaDataHora + '\'' +
                ", chegadaDataHora='" + chegadaDataHora + '\'' +
                ", preço=" + preco +
                ", Tempo de Voo=" + tempoVoo + "h"+
                '}';
    }


}

