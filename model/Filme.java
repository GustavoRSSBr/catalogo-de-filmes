package model;
import java.util.ArrayList;

public class Filme {

	private String nome;
	private String dataLancamento;
	private Double orcamento;
	private String descricao;
	private Diretor diretor;
	private ArrayList<Ator> atores = new ArrayList<>();

	public Filme(String nome, String dataLancamento, Double orcamento, String descricao, Diretor diretor,
			ArrayList<Ator> atores) {
		super();
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.orcamento = orcamento;
		this.descricao = descricao;
		this.diretor = diretor;
		this.atores = atores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public ArrayList<Ator> getAtores() {
		return atores;
	}

	public String exibirInformacao() {
		return "\nNome do Filme: " + this.nome +
				"\nData de Lançamento: " + this.dataLancamento +
				"\nDescrição: " + this.descricao +
				"\n" + diretor.toString() +
				"\nAtores: " + atores.toString() + "\n";
 
	}
}
