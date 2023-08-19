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


	//public ArrayList<Ator> cadastrarAtor() { 
	//} (usar um while para cadastrar até o usuário não querer mais)

	public void buscarNomeFilme(String nomeBusca) {

		System.out.println("Digite o nome do filme.");
		nomeBusca = sc.nextLine();

		boolean encontrado = false;
		for (Filme filme : listaFilmes) {
			if (filme.getNome().equalsIgnoreCase(nomeBusca)) {
				System.out.println("Nome: " + filme.getNome());
				System.out.println("Data de lançamento: " + filme.getDataLancamento());
				System.out.println("Orçamento: " + filme.getOrcamento());
				System.out.println("Diretor: " + filme.getNomeDiretor());
				encontrado = true;
				break;
			} else {
				System.out.print("Não encontrado.");
			}
		}
	}
}
