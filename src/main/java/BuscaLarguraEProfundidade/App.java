package BuscaLarguraEProfundidade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {

  List<No> vetor = new ArrayList<No>();

  public void lerArrayTxt(String nome) {
    String raiz;
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
      /** onde se encontra o projeto do arquivo */
      String path = new File(".").getCanonicalPath();
      FileReader arq = new FileReader(path + "/src/main/java/BuscaLarguraEProfundidade/" + nome);
      BufferedReader lerArq = new BufferedReader(arq);
      String linha = lerArq.readLine(); // lê a primeira linha
      // a variável "linha" recebe o valor "null" quando o processo
      // de repetição atingir o final do arquivo texto
      while (linha != null) {
        System.out.printf("%s\n", linha);

        if (linha != null && !linha.isEmpty()) {
          String separa[] = linha.split("/");
          if (this.vetor.size() == 0) {
            this.vetor.add(new No("", separa[0], 0));//aqui consegue adicionar o primeiro nó q não tem pai, ou seja a raiz
          }
          String nomePai = separa[0];
          No noPai = this.vetor.stream().filter(pai -> nomePai.equals(pai.getNome())).findAny().orElse(null);
          int nivelRaizFilho = noPai.getNivel() + 1;
          this.vetor.add(new No(separa[0], separa[1], nivelRaizFilho));//monta a arvore no arraylist
        }
        linha = lerArq.readLine(); // lê da segunda até a última linha
      }
      
      arq.close();
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
    }
  }

  public static <T> void main(String[] args) {
    App app = new App();
    app.lerArrayTxt("Grafo.txt");

    
    Busca busca = new BuscaEmProfundidade();
    busca.setPontoInicial("B");
    busca.setPontoFinal("G");
    busca.setVetor(app.vetor);
    busca.buscar();

    System.out.println();
    busca = new BuscaEmLargura();
    busca.setPontoInicial("B");
    busca.setPontoFinal("G");
    busca.setVetor(app.vetor);
    busca.buscar();
  }
}
