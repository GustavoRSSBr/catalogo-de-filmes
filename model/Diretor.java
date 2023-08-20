package model;
public class Diretor extends Pessoa {

	public Diretor(String nomePessoa) {
		super(nomePessoa);
	}

	@Override
	public String toString() {
		return "Diretor: " + getNome();
	}

}