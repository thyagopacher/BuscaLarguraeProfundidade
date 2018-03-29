package BuscaLarguraEProfundidade;


/**
 * BuscaEmProfundidade
 */
public class BuscaEmProfundidade extends Busca{

    public BuscaEmProfundidade(){
        
    }

    public void buscar(){
        System.out.println("\n === Buscando por profundidade ===");
        System.out.println(" - Ponto inicial: " + this.getPontoInicial() + " - Ponto final: " + this.getPontoFinal() + "\n - Caminho percorrido:");
        int tamVetor = this.getVetor().size();
        if(tamVetor > 0){
            for (No no : this.getVetor()) {
                this.somarCustoBusca();
                System.out.print(" -> " + no.getNome());
                if(no.getNome().equals(this.getPontoFinal())){
                    break;
                }
            }
        }  
        System.out.println(" - A busca teve custo de: " + this.getCustoBusca());
    }
}