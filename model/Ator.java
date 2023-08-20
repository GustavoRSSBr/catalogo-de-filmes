package model;
public class Ator extends Pessoa {

	private String nomePersonagem;

	public Ator(String nomePessoa, String nomePersonagem) {
		super(nomePessoa);
		this.nomePersonagem = nomePersonagem;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	@Override
	public String toString() {
		return getNome() + " como " + nomePersonagem;
	}

}