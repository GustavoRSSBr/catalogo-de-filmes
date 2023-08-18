package filme;

import java.util.ArrayList;

public class Filme {
	
	private String nome;
	private String dataLancamento;
	private String orcamento;
	private String descricao;
	private Diretor diretor;
	private ArrayList<Autor> autores = new ArrayList<>();
	
	public Filme(String nome, String dataLancamento, String orcamento, String descricao, Diretor diretor) {
		super();
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.orcamento = orcamento;
		this.descricao = descricao;
		this.diretor = diretor;
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

	public String getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(String orcamento) {
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

	public ArrayList<Autor> getAutores() {
		return autores;
	}	
}
