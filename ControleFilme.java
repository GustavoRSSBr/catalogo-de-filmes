package filme;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleFilme {
	
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<Filme> listaFilmes = new ArrayList<>();
	
	public void CadastrarFilme() {
		
		System.out.print("Digite o nome do filme: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite a data de lançamento: ");
		String data = sc.nextLine();
		
		System.out.print("Digite o orçamento do filme: ");
		double orcamento = Double.parseDouble(sc.nextLine());
		
		Diretor diretor = cadastrarDiretor();
		//ArrayList autores = cadastrarAutores();
		
		Filme filme = new Filme(nome, data, orcamento, diretor, autores);
		
		listaFilmes.add(filme);	
	}
	
	public Diretor cadastrarDiretor() {
	}
	
	//public ArrayList<Ator> cadastrarAtor() { 
	//} (usar um while para cadastrar até o usuário não querer mais)
	
	public Filme buscarNomeFilme(String nome){
		for (Filme filme : listaFilmes) {
			if (filme.getNome().equalsIgnoreCase(nome)) {
					return filme;
			}
		}
		return null;
	}
}
