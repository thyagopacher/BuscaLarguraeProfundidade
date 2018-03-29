package BuscaLarguraEProfundidade;

/**
 * No
 */
public class No  implements Comparable<No>{

    private String pai;
    private String nome;
    private int nivel;

    public No(String pai, String nome, int nivel){
        this.pai = pai;
		this.nome = nome;
		this.nivel = nivel;
    }

	/**
	 * @return the pai
	 */
	public String getPai() {
		return pai;
	}
	/**
	 * @param pai the pai to set
	 */
	public void setPai(String pai) {
		this.pai = pai;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public int compareTo(No o) {
		return this.getNome().compareTo(o.getNome());
	}

    
}