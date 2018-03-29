package BuscaLarguraEProfundidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Busca
 */
public class Busca {

    private int custoBusca = 0;
    private String pontoInicial;
    private String pontoFinal;
    private List<No> vetor = new ArrayList<No>();

    public Busca(){

    }

    public void buscar(){

    }

	/**
	 * @return the vetor
	 */
	public List<No> getVetor() {
		return vetor;
	}

	/**
	 * @param vetor the vetor to set
	 */
	public void setVetor(List<No> vetor) {
		this.vetor = vetor;
	}

	/**
	 * @return the pontoInicial
	 */
	public String getPontoInicial() {
		return pontoInicial;
	}

	/**
	 * @param pontoInicial the pontoInicial to set
	 */
	public void setPontoInicial(String pontoInicial) {
		this.pontoInicial = pontoInicial;
	}

	/**
	 * @return the pontoFinal
	 */
	public String getPontoFinal() {
		return pontoFinal;
	}

	/**
	 * @param pontoFinal the pontoFinal to set
	 */
	public void setPontoFinal(String pontoFinal) {
		this.pontoFinal = pontoFinal;
	}

	/**
	 * @return the custoBusca
	 */
	public int getCustoBusca() {
		return custoBusca;
	}

	/**
	 * @param custoBusca the custoBusca to set
	 */
	public void setCustoBusca(int custoBusca) {
		this.custoBusca = custoBusca;
    }
    
    public void somarCustoBusca(){
        this.custoBusca++;
	}

}