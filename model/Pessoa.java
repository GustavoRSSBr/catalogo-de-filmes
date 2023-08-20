package model;
public class Pessoa {
	private String nomePessoa;

	public Pessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getNome() {
		return this.nomePessoa;
	}

	public void setNome(String nome) {
		this.nomePessoa = nome;
	}
	
}
