package classes;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorDeArquivos{


    public static void apagaArquivo(String caminhoArquivo) {
        Path caminho = Path.of(caminhoArquivo);

        try {
            Files.deleteIfExists(caminho);
        } catch (NoSuchFileException excecao) {
            // sucesso
        } catch (IOException excecao) {
            System.out.println();
        }
    }



    public static void criaArquivo(String caminhoArquivo) {
        Path caminho = Path.of(caminhoArquivo);

        try {
            Files.createFile(caminho);
        } catch (IOException excecao) {

        }

    }

    public static List<String> leLinhas(String caminhoArquivo) {
        Path caminho = Paths.get(caminhoArquivo);

        try {
            List<String> listaArquivo = Files.readAllLines(caminho);
            return listaArquivo;
            // Files.lines(caminho)
        } catch (IOException excecao) {
            return null;
        }
    }


    public static void escreveLinhas(String caminhoArquivo, String[] conteudoArquivo, String cabecalho) {
        Path caminho = Paths.get(caminhoArquivo);

        //byte[] cabecalho = converter.getBytes();
        List<String> lisConteudoArquivo = Arrays.stream(conteudoArquivo).collect(Collectors.toList());
        lisConteudoArquivo.add(0, cabecalho);
        try {
            //Files.write(caminho, cabecalho);
            Files.write(caminho, lisConteudoArquivo);
        } catch (IOException excecao) { }
    }
}