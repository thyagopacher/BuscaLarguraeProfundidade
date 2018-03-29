package BuscaLarguraEProfundidade;

import java.util.List;
import java.util.stream.Collectors;

/**
 * BuscaEmLargura
 */
public class BuscaEmLargura extends Busca {

    public BuscaEmLargura() {

    }

    public boolean percorre(int num) {
        boolean acho = false;
        final int i = num + 1;
        List<No> result = this.getVetor().stream().filter(line -> i == line.getNivel()).collect(Collectors.toList());
        if (result != null && !result.isEmpty()) {
            for (No no : result) {
                this.somarCustoBusca();
                System.out.print(" -> " + no.getNome());
                if (no.getNome().equals(this.getPontoFinal())) {
                    acho = true;
                    break;
                }
            }
        }
        return acho;
    }

    public void buscar() {
        System.out.println("\n === Buscando por largura ===");
        System.out.println(" - Ponto inicial: " + this.getPontoInicial() + " - Ponto final: " + this.getPontoFinal()
                + "\n - Caminho percorrido:");
        int tamVetor = this.getVetor().size();

        if (tamVetor > 0) {
            boolean acho = this.percorre(-1);
            int i = 0;
            while (acho == false) {
                acho = this.percorre(i);
                if(acho){
                    break;
                }
                i++;
            }
        }
        System.out.println(" - A busca teve custo de: " + this.getCustoBusca());
    }
}